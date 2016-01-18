package com.kingroot.kinguser; class jd { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/jd;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile jdSPEdit done"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;// .field final synthetic jC:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/kingroot/kinguser/jc;Landroid/content/SharedPreferences$Editor;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/jd;->jC:Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 171
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/jd;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 173
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "editor can not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     iput-object p2, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 177
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public apply()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 224
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public commit()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     .line 231
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 212
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 195
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 201
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 181
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/jd;->jB:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 218
a=0;//     return-object p0
a=0;// .end method
}}
