package com.kingroot.kinguser.baseui; class BaseActivity { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/baseui/BaseActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;// .field protected eG:Landroid/os/Bundle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/baseui/BaseActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract ar()Lcom/kingroot/kinguser/dp;
a=0;// .end method
a=0;// 
a=0;// .method public finish()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     invoke-super {p0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/kingroot/kinguser/dp;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onApplyThemeResource(Landroid/content/res/Resources$Theme;IZ)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/kingroot/kinguser/dp;->onApplyThemeResource(Landroid/content/res/Resources$Theme;IZ)V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onApplyThemeResource(Landroid/content/res/Resources$Theme;IZ)V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 244
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->aO()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 250
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 30
a=0;//     #v2=(Byte);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eG:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/baseui/BaseActivity;->ar()Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eG:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/dp;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->aC()V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->Y()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/kingroot/kinguser/baseui/BaseActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onDestroy()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/kingroot/kinguser/dp;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 140
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 144
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyLongPress(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/kingroot/kinguser/dp;->onKeyLongPress(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 262
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyMultiple(IILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/kingroot/kinguser/dp;->onKeyMultiple(IILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onKeyMultiple(IILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/kingroot/kinguser/dp;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 129
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLowMemory()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onLowMemory()V
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onPause()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->onPostCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 218
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onPostResume()V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPostResume()V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onRestart()V
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onResume()V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onStart()V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onStop()V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/receiver/MainExitReceiver;->js()V
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 282
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onUserInteraction()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onUserInteraction()V
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onUserInteraction()V
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUserLeaveHint()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onUserLeaveHint()V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivity(Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dp;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     const-string v0, "Title"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/dp;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ea;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 170
a=0;//     :goto_0
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const-string v0, "Title"
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startActivityForResult(Landroid/content/Intent;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/dp;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     const-string v0, "Title"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/baseui/BaseActivity;->eF:Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dp;);
a=0;//     iget-object v1, v1, Lcom/kingroot/kinguser/dp;->eL:Lcom/kingroot/kinguser/ea;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/ea;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const-string v0, "Title"
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
