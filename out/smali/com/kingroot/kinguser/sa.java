package com.kingroot.kinguser; class sa { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/sa;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic rN:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/rz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/sa;->rN:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/sa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     .line 162
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 168
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v1, v3}, Lcom/kingroot/kinguser/ul;->a(Landroid/content/Context;IZ)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 169
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Lcom/kingroot/kinguser/ul;->c(Landroid/content/Context;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 173
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     const/16 v4, 0x7d0
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v3, v4, :cond_7
a=0;// 
a=0;//     .line 175
a=0;//     :try_start_1
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f0a000e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 179
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "com.android.kinguser.console"
a=0;// 
a=0;//     .line 188
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 189
a=0;//     :cond_3
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 190
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 193
a=0;//     :cond_4
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 198
a=0;//     :cond_6
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 199
a=0;//     iput-object v2, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 206
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sa;->rN:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/rz;->a(Lcom/kingroot/kinguser/rz;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :catch_0
a=0;//     #v3=(Integer);v4=(PosShort);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 177
a=0;//     :try_start_3
a=0;//     const-string v1, "ADB Program"
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     const/16 v4, 0x2710
a=0;// 
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     .line 182
a=0;//     :try_start_4
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v3, 0x7f0a000f
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 183
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_5
a=0;//     const-string v1, "System Program"
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 208
a=0;//     :cond_8
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/sa;->rN:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/rz;->b(Lcom/kingroot/kinguser/rz;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// .end method
}}
