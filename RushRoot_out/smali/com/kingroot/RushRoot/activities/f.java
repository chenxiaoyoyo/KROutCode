package com.kingroot.RushRoot.activities; class f { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/activities/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/RushRoot/activities/MainActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iput-object p1, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/activities/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 133
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/activities/MainActivity;);
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/activities/MainActivity;->a(Lcom/kingroot/RushRoot/activities/MainActivity;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     const-wide/16 v2, 0x12c
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/activities/MainActivity;->b(Lcom/kingroot/RushRoot/activities/MainActivity;)I
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcom/kingroot/RushRoot/activities/MainActivity;->a(Lcom/kingroot/RushRoot/activities/MainActivity;J)J
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/activities/MainActivity;->d(Lcom/kingroot/RushRoot/activities/MainActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     sget-boolean v0, Lcom/kingroot/RushRoot/br;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/MainActivity;);
a=0;//     const-string v1, "\u8fdb\u5165\u6d4b\u8bd5\u9875\u9762"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/RushRoot/activities/MainActivity;);
a=0;//     const-class v3, Lcom/kingroot/RushRoot/activities/TestActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/activities/MainActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/kingroot/RushRoot/activities/f;->a:Lcom/kingroot/RushRoot/activities/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/activities/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/activities/MainActivity;->c(Lcom/kingroot/RushRoot/activities/MainActivity;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
