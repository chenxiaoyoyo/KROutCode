package com.kingroot.kinguser; class jb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jb;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;// .field private static final jx:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jb;->jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     .line 19
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const-string v0, "permissions.sqlite"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 26
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->setLockingEnabled(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 30
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 28
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "DROP TABLE IF EXISTS "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0, p2, v0}, Lcom/kingroot/kinguser/jb;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 325
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 323
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     .line 289
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 290
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 293
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 291
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ez()Lcom/kingroot/kinguser/jb;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jb;->jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     const-class v1, Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jb;->jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jb;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/kinguser/jb;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/jb;->jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/jb;->jw:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 42
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 215
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 216
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v2, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 219
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 221
a=0;//     return v0
a=0;// 
a=0;//     .line 219
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 217
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 191
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 192
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v2, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 195
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 197
a=0;//     return v0
a=0;// 
a=0;//     .line 195
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 193
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 165
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 168
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 169
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, p1, v4, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 172
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v4=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 174
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 172
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 170
a=0;//     :catch_0
a=0;//     #v0=(LongLo);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 107
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/jb;->b(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/kingroot/kinguser/ey;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 255
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-interface {p1, v1}, Lcom/kingroot/kinguser/ey;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 257
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 258
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 262
a=0;//     #v0=(One);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 267
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 259
a=0;//     :catch_0
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 262
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     :cond_1
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 266
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 262
a=0;//     :catchall_1
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 263
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public aF(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 236
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, p1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 240
a=0;//     return v0
a=0;// 
a=0;//     .line 239
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 237
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 122
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/jb;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 124
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v2, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 129
a=0;//     return-object v0
a=0;// 
a=0;//     .line 127
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 125
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public i(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     sget-object v1, Lcom/kingroot/kinguser/jb;->jx:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1, p2}, Lcom/kingroot/kinguser/jb;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const-string v0, "CREATE TABLE IF NOT EXISTS apps (pkgName varchar(300) primary key,appName varchar(200),rtime integer,rule integer,vtime LONG)"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/jb;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "CREATE TABLE IF NOT EXISTS permission_log (_id INTEGER PRIMARY KEY,time INTEGER,pkgname TEXT,appname TEXT,permtype INTEGER,permstate INTEGER)"
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/kingroot/kinguser/jb;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     if-ge p2, p3, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     const-string v0, "permission_log"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/jb;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/jb;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
