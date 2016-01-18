package com.kingroot.kinguser; class jg { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/jg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jg;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jb;->ez()Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jg;->jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Lcom/kingroot/kinguser/kn;)Landroid/content/ContentValues;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/kn;->kK:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 92
a=0;//     const-string v1, "pkgname"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kn;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "appname"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kn;->kI:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     const-string v1, "permtype"
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/kn;->lc:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "permstate"
a=0;// 
a=0;//     iget v2, p0, Lcom/kingroot/kinguser/kn;->mState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public b(Lcom/kingroot/kinguser/kn;)J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jg;->jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const-string v1, "permission_log"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lcom/kingroot/kinguser/jg;->d(Lcom/kingroot/kinguser/kn;)Landroid/content/ContentValues;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jb;->a(Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcom/kingroot/kinguser/kn;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jg;->jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const-string v1, "permission_log"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "_id="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/kn;->hh()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/kingroot/kinguser/jb;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public cz()Ljava/util/List;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     new-instance v9, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, "select * from permission_log"
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/jg;->jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/kingroot/kinguser/jb;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kn;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v10, v1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v10, v3}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-interface {v10, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-interface {v10, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-interface {v10, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-interface {v10, v8}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/kingroot/kinguser/kn;-><init>(JJLjava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kn;);
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 60
a=0;//     return-object v9
a=0;// .end method
a=0;// 
a=0;// .method public gJ()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jg;->jK:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const-string v1, "permission_log"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/jb;->aF(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
