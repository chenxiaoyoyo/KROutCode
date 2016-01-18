package com.kingroot.kinguser; class je { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/je;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/je;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jb;->ez()Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private X(I)Ljava/util/HashMap;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const-string v2, "select * from apps where rule=?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/kingroot/kinguser/jb;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 170
a=0;//     :goto_0
a=0;//     #v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     const-string v2, "appName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 172
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "pkgName"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 173
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rtime"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 174
a=0;//     const-string v5, "vtime"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     .line 175
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-string v7, "rule"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {v1, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v8, Lcom/kingroot/kinguser/kf;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/kingroot/kinguser/kf;);
a=0;//     invoke-direct {v8}, Lcom/kingroot/kinguser/kf;-><init>()V
a=0;// 
a=0;//     .line 178
a=0;//     #v8=(Reference,Lcom/kingroot/kinguser/kf;);
a=0;//     iput-object v2, v8, Lcom/kingroot/kinguser/kf;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 179
a=0;//     iput-object v3, v8, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 180
a=0;//     int-to-long v9, v4
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iput-wide v9, v8, Lcom/kingroot/kinguser/kf;->kK:J
a=0;// 
a=0;//     .line 181
a=0;//     iput v7, v8, Lcom/kingroot/kinguser/kf;->mRule:I
a=0;// 
a=0;//     .line 182
a=0;//     iput-wide v5, v8, Lcom/kingroot/kinguser/kf;->kN:J
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v0, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 187
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;IJJ)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "pkgName= \'"
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
a=0;//     const-string v1, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "rule"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 101
a=0;//     const-string v2, "rtime"
a=0;// 
a=0;//     invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v2, "vtime"
a=0;// 
a=0;//     invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     const-string v3, "apps"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v1, v0, v4}, Lcom/kingroot/kinguser/jb;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aM(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     const-string v1, "delete from apps where pkgName=?"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/jb;->i(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(JLjava/lang/String;Ljava/lang/String;IJ)V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v9, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     #v9=(Reference,Lcom/kingroot/kinguser/jb;);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/jf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/jf;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/je;);
a=0;//     move-object v2, p4
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-wide v4, p1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-wide/from16 v7, p6
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/kingroot/kinguser/jf;-><init>(Lcom/kingroot/kinguser/je;Ljava/lang/String;Ljava/lang/String;JIJ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jf;);
a=0;//     invoke-virtual {v9, v0}, Lcom/kingroot/kinguser/jb;->a(Lcom/kingroot/kinguser/ey;)Z
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gG()Ljava/util/HashMap;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "select * from apps order by rule asc, rtime desc"
a=0;// 
a=0;//     .line 115
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/je;->jD:Lcom/kingroot/kinguser/jb;
a=0;// 
a=0;//     const-string v2, "select * from apps order by rule asc, rtime desc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/kingroot/kinguser/jb;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     const-string v2, "appName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 119
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "pkgName"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 120
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rtime"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 121
a=0;//     const-string v5, "vtime"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     .line 122
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-string v7, "rule"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {v1, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v8, Lcom/kingroot/kinguser/kf;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/kingroot/kinguser/kf;);
a=0;//     invoke-direct {v8}, Lcom/kingroot/kinguser/kf;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     #v8=(Reference,Lcom/kingroot/kinguser/kf;);
a=0;//     iput-object v2, v8, Lcom/kingroot/kinguser/kf;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     iput-object v3, v8, Lcom/kingroot/kinguser/kf;->kJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 127
a=0;//     int-to-long v9, v4
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iput-wide v9, v8, Lcom/kingroot/kinguser/kf;->kK:J
a=0;// 
a=0;//     .line 128
a=0;//     iput v7, v8, Lcom/kingroot/kinguser/kf;->mRule:I
a=0;// 
a=0;//     .line 129
a=0;//     iput-wide v5, v8, Lcom/kingroot/kinguser/kf;->kN:J
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {v0, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 134
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gH()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/je;->X(I)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gI()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/je;->X(I)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
}}
