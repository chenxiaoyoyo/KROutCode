package com.kingroot.kinguser; class adi { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/adi;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/adf;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/adi;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/adi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x4b0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 297
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/adi;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/adf;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/kinguser/adf;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/kingroot/kinguser/dr;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 299
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 300
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ff;->bP()Lcom/kingroot/kinguser/ff;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/ff;);
a=0;//     invoke-virtual {v5}, Lcom/kingroot/kinguser/ff;->bX()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 301
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Locale;);
a=0;//     const-string v8, "pm enable %s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-array v9, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v5, v9, v0
a=0;// 
a=0;//     invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     .line 304
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vb;->kZ()Lcom/kingroot/kinguser/vb;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v5, v7}, Lcom/kingroot/kinguser/vb;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v5, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-boolean v5, v5, Landroid/content/pm/ApplicationInfo;->enabled:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iput v0, v2, Landroid/os/Message;->arg1:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 311
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v7, v5, v3
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v0, v7, v10
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 313
a=0;//     add-long/2addr v3, v10
a=0;// 
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adi;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/adf;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/dr;->removeMessages(I)V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/adi;->Fi:Lcom/kingroot/kinguser/adf;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/adf;->aM()Lcom/kingroot/kinguser/dr;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/dr;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 321
a=0;//     return-void
a=0;// 
a=0;//     .line 314
a=0;//     :catch_0
a=0;//     #v0=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 306
a=0;//     :catch_1
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Reference,Ujava/lang/Object;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
