package com.kingroot.sdk.root; class g { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/root/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:I
a=0;// 
a=0;// .field public d:J
a=0;// 
a=0;// .field public e:J
a=0;// 
a=0;// .field public f:J
a=0;// 
a=0;// .field public g:I
a=0;// 
a=0;// .field public h:Ljava/lang/String;
a=0;// 
a=0;// .field public i:Ljava/lang/String;
a=0;// 
a=0;// .field public j:Z
a=0;// 
a=0;// .field public k:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 198
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/g;->j:Z
a=0;// 
a=0;//     .line 200
a=0;//     iput-boolean v0, p0, Lcom/kingroot/sdk/root/g;->k:Z
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     const-string v0, "kingrootsdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     const-string v1, "x_last_nano_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 108
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const-string v0, "kingrootsdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "x_exploit_ret"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "x_exploit_errcodes"
a=0;// 
a=0;//     invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const-string v0, "kingrootsdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     const-string v1, "x_sid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 73
a=0;//     const-string v1, "x_sindex"
a=0;// 
a=0;//     invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 74
a=0;//     const-string v1, "x_stype"
a=0;// 
a=0;//     invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "x_start_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 76
a=0;//     const-string v1, "x_start_nano_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 77
a=0;//     const-string v1, "x_last_nano_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 78
a=0;//     const-string v1, "x_exploit_ret"
a=0;// 
a=0;//     const/16 v2, 0x1b8d
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 79
a=0;//     const-string v1, "x_exploit_errcodes"
a=0;// 
a=0;//     const-string v2, "7053"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v4=(Null);
a=0;//     const-string v1, "kingrootsdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 125
a=0;//     const-string v2, "x_sid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 126
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Integer);
a=0;//     new-instance v0, Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/sdk/root/g;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/sdk/root/g;-><init>()V
a=0;// 
a=0;//     .line 130
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     iput-object v2, v0, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     const-string v2, "x_sindex"
a=0;// 
a=0;//     invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/sdk/root/g;->b:I
a=0;// 
a=0;//     .line 132
a=0;//     const-string v2, "x_stype"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/sdk/root/g;->c:I
a=0;// 
a=0;//     .line 133
a=0;//     const-string v2, "x_start_time"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/kingroot/sdk/root/g;->d:J
a=0;// 
a=0;//     .line 134
a=0;//     const-string v2, "x_start_nano_time"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iput-wide v2, v0, Lcom/kingroot/sdk/root/g;->e:J
a=0;// 
a=0;//     .line 135
a=0;//     const-string v2, "x_last_nano_time"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iput-wide v2, v0, Lcom/kingroot/sdk/root/g;->f:J
a=0;// 
a=0;//     .line 136
a=0;//     const-string v2, "x_exploit_ret"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x1b8d
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     .line 137
a=0;//     const-string v2, "x_exploit_errcodes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "7053"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/kingroot/sdk/root/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 138
a=0;//     const-string v2, "x_sdk_old_root_status"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/sdk/root/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/lang/String;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     const-string v0, "kingrootsdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     const-string v1, "x_sdk_old_root_status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "x_sdk_start_nano_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->nanoTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 94
a=0;//     const-string v1, "x_sdk_solution_count"
a=0;// 
a=0;//     invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 96
a=0;//     const-string v1, "x_sdk_su_mode"
a=0;// 
a=0;//     invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 97
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)Lcom/kingroot/sdk/root/h;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v5=(Null);
a=0;//     const-string v0, "kingrootsdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v1, Lcom/kingroot/sdk/root/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/sdk/root/h;);
a=0;//     invoke-direct {v1}, Lcom/kingroot/sdk/root/h;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     #v1=(Reference,Lcom/kingroot/sdk/root/h;);
a=0;//     const-string v2, "x_sdk_old_root_status"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/kingroot/sdk/root/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 148
a=0;//     const-string v2, "x_sdk_start_nano_time"
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v1, Lcom/kingroot/sdk/root/h;->b:J
a=0;// 
a=0;//     .line 149
a=0;//     const-string v2, "x_sdk_solution_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Lcom/kingroot/sdk/root/h;->c:I
a=0;// 
a=0;//     .line 151
a=0;//     const-string v2, "x_sdk_su_mode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Lcom/kingroot/sdk/root/h;->d:I
a=0;// 
a=0;//     .line 152
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     invoke-static {p0}, Lcom/kingroot/sdk/root/g;->b(Landroid/content/Context;)Lcom/kingroot/sdk/root/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 177
a=0;//     #v0=(Reference,Lcom/kingroot/sdk/root/g;);
a=0;//     const-string v1, "kingrootsdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "x_sid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_sindex"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_stype"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_start_time"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_start_nano_time"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_last_nano_time"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_exploit_ret"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v2, "x_exploit_errcodes"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 178
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Lcom/kingroot/RushRoot/go;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/go;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/go;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/RushRoot/go;-><init>()V
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/go;);
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/g;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/kingroot/RushRoot/go;->e:J
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/root/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/kingroot/RushRoot/go;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 190
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/g;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->b:I
a=0;// 
a=0;//     .line 191
a=0;//     iget v1, p0, Lcom/kingroot/sdk/root/g;->c:I
a=0;// 
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->f:I
a=0;// 
a=0;//     .line 192
a=0;//     iget-wide v1, p0, Lcom/kingroot/sdk/root/g;->d:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long/2addr v1, v3
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->c:I
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Lcom/kingroot/RushRoot/go;->d:I
a=0;// 
a=0;//     .line 194
a=0;//     return-object v0
a=0;// .end method
}}
