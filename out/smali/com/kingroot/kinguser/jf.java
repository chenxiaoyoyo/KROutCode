package com.kingroot.kinguser; class jf { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/jf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/ey;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic jE:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic jF:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic jG:J
a=0;// 
a=0;// .field final synthetic jH:I
a=0;// 
a=0;// .field final synthetic jI:J
a=0;// 
a=0;// .field final synthetic jJ:Lcom/kingroot/kinguser/je;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/je;Ljava/lang/String;Ljava/lang/String;JIJ)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/jf;->jJ:Lcom/kingroot/kinguser/je;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/jf;->jE:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/kingroot/kinguser/jf;->jF:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide p4, p0, Lcom/kingroot/kinguser/jf;->jG:J
a=0;// 
a=0;//     iput p6, p0, Lcom/kingroot/kinguser/jf;->jH:I
a=0;// 
a=0;//     iput-wide p7, p0, Lcom/kingroot/kinguser/jf;->jI:J
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jf;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public d(Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v3=(Null);
a=0;//     instance-of v0, p1, Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     check-cast p1, Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 58
a=0;//     const-string v0, "delete from apps where pkgName=?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/jf;->jE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 60
a=0;//     const-string v0, "insert into apps (pkgName, appName, rtime, rule, vtime) values (?,?,?,?,?)"
a=0;// 
a=0;//     .line 68
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/jf;->jE:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/jf;->jF:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v2, v1, v4
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget-wide v3, p0, Lcom/kingroot/kinguser/jf;->jG:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     iget v3, p0, Lcom/kingroot/kinguser/jf;->jH:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     iget-wide v3, p0, Lcom/kingroot/kinguser/jf;->jI:J
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
