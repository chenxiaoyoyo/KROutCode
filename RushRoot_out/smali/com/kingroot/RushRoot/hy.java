package com.kingroot.RushRoot; class hy { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/hy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Lcom/kingroot/RushRoot/hp;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 112
a=0;//     .line 113
a=0;//     #v4=(Byte);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/RushRoot/hy;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Lcom/kingroot/RushRoot/hp;);v2=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);
a=0;//     iget v2, p2, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v4, :cond_2
a=0;// 
a=0;//     iget v2, v1, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     iget v3, p2, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     .line 122
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget v2, p2, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     if-eq v2, v4, :cond_4
a=0;// 
a=0;//     iget v2, v1, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     iget v3, p2, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_4
a=0;// 
a=0;//     .line 123
a=0;//     :cond_3
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     iget v2, p2, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     if-eq v2, v4, :cond_7
a=0;// 
a=0;//     iget v2, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     iget v3, p2, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_7
a=0;// 
a=0;//     .line 128
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 137
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-wide v2, p2, Lcom/kingroot/RushRoot/hp;->d:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     iget-wide v2, v1, Lcom/kingroot/RushRoot/hp;->d:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iget-wide v4, p2, Lcom/kingroot/RushRoot/hp;->d:J
a=0;// 
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 138
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 142
a=0;//     :cond_6
a=0;//     iget-object v2, p2, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p2, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/kingroot/RushRoot/hp;);v2=(Integer);v3=(Conflicted);v4=(Byte);v5=(Uninit);
a=0;//     iget v2, p2, Lcom/kingroot/RushRoot/hp;->f:I
a=0;// 
a=0;//     if-eq v2, v4, :cond_5
a=0;// 
a=0;//     iget v2, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     iget v3, p2, Lcom/kingroot/RushRoot/hp;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p2, Lcom/kingroot/RushRoot/hp;->f:I
a=0;// 
a=0;//     if-eq v2, v3, :cond_5
a=0;// 
a=0;//     .line 132
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     .line 58
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 51
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/jf;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 52
a=0;//     #v2=(LongLo);
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/jf;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     cmp-long v0, v2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;)Lcom/kingroot/RushRoot/hp;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/kingroot/RushRoot/hp;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/RushRoot/hp;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/RushRoot/hp;-><init>()V
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/im;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 158
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " zls "
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/kingroot/RushRoot/jc;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/jb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v2}, Lcom/kingroot/RushRoot/jb;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v2, Lcom/kingroot/RushRoot/jb;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "Hehe"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hp;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v2, Lcom/kingroot/RushRoot/jb;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 166
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     .line 168
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Lcom/kingroot/RushRoot/hp;->c:I
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Lcom/kingroot/RushRoot/hp;->a:I
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Lcom/kingroot/RushRoot/hp;->b:I
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, v1, Lcom/kingroot/RushRoot/hp;->d:J
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "-"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(PosByte);
a=0;//     iput-object v2, v1, Lcom/kingroot/RushRoot/hp;->e:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hp;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     #v0=(Null);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v2, v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 175
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Lcom/kingroot/RushRoot/hp;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 191
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     :try_start_0
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/jg;->c(Ljava/io/File;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     invoke-static {p0, v0, p2}, Lcom/kingroot/RushRoot/hy;->a(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Lcom/kingroot/RushRoot/hp;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 199
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/io/File;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Lcom/kingroot/RushRoot/hp;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/jg;->c(Ljava/io/File;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "repair "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "...chown,chmod,chcon"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 238
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/hz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/hz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/hz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/hz;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 279
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     .line 238
a=0;//     invoke-static {p0, v0, v1}, Lcom/kingroot/RushRoot/iu;->a(Lcom/kingroot/RushRoot/jc;Lcom/kingroot/RushRoot/iv;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 232
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Lcom/kingroot/RushRoot/jc;Ljava/util/List;Lcom/kingroot/RushRoot/hp;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 218
a=0;//     invoke-static {p0, v0, p2}, Lcom/kingroot/RushRoot/hy;->b(Lcom/kingroot/RushRoot/jc;Ljava/lang/String;Lcom/kingroot/RushRoot/hp;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
