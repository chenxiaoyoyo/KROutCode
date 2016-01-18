package com.kingroot.kinguser; class dx { void a() { int a;
a=0;// .class public abstract Lcom/kingroot/kinguser/dx;
a=0;// .super Lcom/kingroot/kinguser/dn;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// .field protected fd:Lcom/kingroot/kinguser/dz;
a=0;// 
a=0;// .field protected fe:I
a=0;// 
a=0;// .field protected ff:I
a=0;// 
a=0;// .field private final mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/dn;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/dx;);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/dx;->fe:I
a=0;// 
a=0;//     .line 29
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/dx;->ff:I
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dy;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/dy;-><init>(Lcom/kingroot/kinguser/dx;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dy;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dx;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(ILcom/kingroot/kinguser/dp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected aF()Landroid/view/View;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dx;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dx;->fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/kingroot/kinguser/dz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/dz;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/kingroot/kinguser/dz;-><init>(Lcom/kingroot/kinguser/dx;Lcom/kingroot/kinguser/dy;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/dz;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/dx;->fd:Lcom/kingroot/kinguser/dz;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dx;->fd:Lcom/kingroot/kinguser/dz;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/dz;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/dx;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     const v1, 0x7f09000f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setId(I)V
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->fc:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dn;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget v1, p0, Lcom/kingroot/kinguser/dx;->ff:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->b(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/kingroot/kinguser/dn;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/kingroot/kinguser/dp;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     invoke-super {p0, p1}, Lcom/kingroot/kinguser/dn;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/dp;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onDestroy()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dn;->onDestroy()V
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 184
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onPause()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dn;->onPause()V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dn;->onResume()V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onResume()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dn;->onStart()V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/dx;->eH:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/dp;
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/dp;->onStop()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/dn;->onStop()V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
}}
