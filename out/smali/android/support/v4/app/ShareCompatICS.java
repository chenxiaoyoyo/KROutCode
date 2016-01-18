package android.support.v4.app; class ShareCompatICS { void a() { int a;
a=0;// .class Landroid/support/v4/app/ShareCompatICS;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HISTORY_FILENAME_PREFIX:Ljava/lang/String; = ".sharecompat_"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompatICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static configureMenuItem(Landroid/view/MenuItem;Landroid/app/Activity;Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-interface {p0}, Landroid/view/MenuItem;->getActionProvider()Landroid/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Reference,Landroid/view/ActionProvider;);
a=0;//     instance-of v1, v0, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ShareActionProvider;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ShareActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 36
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/ShareActionProvider;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ".sharecompat_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ShareActionProvider;->setShareHistoryFileName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v0, p2}, Landroid/widget/ShareActionProvider;->setShareIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {p0, v0}, Landroid/view/MenuItem;->setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     check-cast v0, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
