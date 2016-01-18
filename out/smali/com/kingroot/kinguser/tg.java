package com.kingroot.kinguser; class tg { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/th;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;// .field private td:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private te:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/tg;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tg;->td:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/SharedPreferences$Editor;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 203
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 200
a=0;//     invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getEditor()Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tg;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tg;->td:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/tg;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tg;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public C(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tg;->getEditor()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 101
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/tg;->te:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/tg;->a(Landroid/content/SharedPreferences$Editor;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);v1=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 107
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bG(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tg;->getEditor()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/tg;->a(Landroid/content/SharedPreferences$Editor;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tg;->getEditor()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/tg;->a(Landroid/content/SharedPreferences$Editor;)Z
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getInt(Ljava/lang/String;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tg;->td:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/tg;->td:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public q(Ljava/lang/String;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/tg;->getEditor()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 114
a=0;//     iget-boolean v1, p0, Lcom/kingroot/kinguser/tg;->te:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/tg;->a(Landroid/content/SharedPreferences$Editor;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
