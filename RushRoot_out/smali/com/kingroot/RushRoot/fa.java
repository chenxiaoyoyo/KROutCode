package com.kingroot.RushRoot; class fa { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/fa;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/ey;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/ez;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/fa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     #v1=(Null);
a=0;//     const-string v0, "Finish: scan su"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fb;->a()Z
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/fb;->b()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     const-string v0, "\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 95
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "time line:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     aget-object v4, v3, v4
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     aget-object v0, v3, v0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 99
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     array-length v6, v3
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     add-int/lit8 v7, v6, -0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v0, v7, :cond_2
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/sdk/util/i;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/er;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     const-wide/32 v2, 0x240c8400
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/kingroot/RushRoot/ez;->a(J)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     const-string v4, "reportroot_name_timestamp"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "reportroot_key_last_scan_su_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Integer);v3=(Reference,[Ljava/lang/String;);v4=(LongLo);v5=(LongHi);v6=(Integer);v7=(Integer);
a=0;//     aget-object v7, v3, v0
a=0;// 
a=0;//     .line 101
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\t0\t"
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 103
a=0;//     const-string v8, "\t"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Su line: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/kingroot/RushRoot/fe;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v8, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     iget-object v8, v8, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/kingroot/RushRoot/fd;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const-string v10, "reportroot_name_scan_su_result"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v8, v10, v11}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "result_"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-interface {v10, v11, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     add-int/lit8 v7, v9, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const-string v9, "reportroot_name_scan_su_result"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "reportroot_key_scan_result_count"
a=0;// 
a=0;//     invoke-interface {v8, v9, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     .line 124
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Scan su failed: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/RushRoot/ez;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ff;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const-string v0, "Screen is on, ignore the failure"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fe;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ez;->a(Lcom/kingroot/RushRoot/ez;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/ez;->a(Lcom/kingroot/RushRoot/ez;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 132
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 133
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     cmp-long v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/kingroot/RushRoot/ez;->a(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/fa;->a:Lcom/kingroot/RushRoot/ez;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/ez;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/RushRoot/ez;->a(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
