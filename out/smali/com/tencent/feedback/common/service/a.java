package com.tencent.feedback.common.service; class a { void a() { int a;
a=0;// .class public Lcom/tencent/feedback/common/service/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/StringBuilder;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p1, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 29
a=0;//     iput p2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Intent;)Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     #v2=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/service/RQDServiceTask;);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "com.tencent.feedback.104"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const-class v3, Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 38
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);v3=(Conflicted);
a=0;//     const-class v3, Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/feedback/common/service/RQDServiceTask;
a=0;// 
a=0;//     .line 39
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/tencent/feedback/common/service/RQDServiceTask;);v2=(Null);v3=(Reference,Ljava/lang/Class;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     const-string v4, "verify task fail %s %d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/feedback/common/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v2=(Null);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v3, "2000"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Lcom/tencent/feedback/common/service/RQDServiceTask;->getTaskName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3e8
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 20
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 22
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 24
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(BLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 48
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 55
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(DLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p3}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 90
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(FLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 83
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 69
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(JLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0, p3}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 76
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/tencent/feedback/proguard/j;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     const/16 v0, 0x7b
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 358
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 364
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/16 v0, 0x7d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 365
a=0;//     return-object p0
a=0;// 
a=0;//     .line 361
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/tencent/feedback/proguard/j;->a(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     instance-of v0, p1, Ljava/lang/Byte;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     check-cast p1, Ljava/lang/Byte;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(BLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 314
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(ZLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_2
a=0;//     instance-of v0, p1, Ljava/lang/Short;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 316
a=0;//     check-cast p1, Ljava/lang/Short;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(SLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 318
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(ILjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 320
a=0;//     check-cast p1, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/feedback/common/service/a;->a(JLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     instance-of v0, p1, Ljava/lang/Float;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 322
a=0;//     check-cast p1, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a(FLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 323
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/Double;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 324
a=0;//     check-cast p1, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/feedback/common/service/a;->a(DLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     instance-of v0, p1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 326
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 327
a=0;//     :cond_8
a=0;//     instance-of v0, p1, Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 328
a=0;//     check-cast p1, Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :cond_9
a=0;//     instance-of v0, p1, Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 330
a=0;//     check-cast p1, Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/util/Collection;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :cond_a
a=0;//     instance-of v0, p1, Lcom/tencent/feedback/proguard/j;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 332
a=0;//     check-cast p1, Lcom/tencent/feedback/proguard/j;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a(Lcom/tencent/feedback/proguard/j;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 333
a=0;//     :cond_b
a=0;//     instance-of v0, p1, [B
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 334
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([BLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     :cond_c
a=0;//     instance-of v0, p1, [Z
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 336
a=0;//     check-cast p1, [Z
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_d
a=0;//     instance-of v0, p1, [S
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     .line 338
a=0;//     check-cast p1, [S
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([SLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_e
a=0;//     instance-of v0, p1, [I
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 340
a=0;//     check-cast p1, [I
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([ILjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 341
a=0;//     :cond_f
a=0;//     instance-of v0, p1, [J
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     .line 342
a=0;//     check-cast p1, [J
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([JLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     :cond_10
a=0;//     instance-of v0, p1, [F
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 344
a=0;//     check-cast p1, [F
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([FLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 345
a=0;//     :cond_11
a=0;//     instance-of v0, p1, [D
a=0;// 
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 346
a=0;//     check-cast p1, [D
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([DLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_12
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 348
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/feedback/common/service/a;->a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 350
a=0;//     :cond_13
a=0;//     new-instance v0, Lcom/tencent/feedback/proguard/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/feedback/proguard/b;);
a=0;//     const-string v1, "write object error: unsupport type."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/feedback/proguard/b;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/feedback/proguard/b;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/Collection;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\t"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 288
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/feedback/common/service/a;->a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 241
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 259
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", {}\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", {\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 250
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 251
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     new-instance v2, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     invoke-direct {v2, v0, v3}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 252
a=0;//     #v2=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 253
a=0;//     const/16 v4, 0x28
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 254
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 255
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v5}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 256
a=0;//     const/16 v0, 0x29
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0, v5}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 258
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     const/16 v0, 0x7d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v5}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(SLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 62
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public a(ZLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x54
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 41
a=0;//     return-object p0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v0, 0x46
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([BLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 107
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 118
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-byte v3, p1, v0
a=0;// 
a=0;//     .line 119
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/tencent/feedback/common/service/a;->a(BLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 118
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 120
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([DLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 221
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 235
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-wide v3, p1, v0
a=0;// 
a=0;//     .line 233
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4, v5}, Lcom/tencent/feedback/common/service/a;->a(DLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 232
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 234
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v5}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([FLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 202
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 212
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 213
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget v3, p1, v0
a=0;// 
a=0;//     .line 214
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/tencent/feedback/common/service/a;->a(FLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 213
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 215
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([ILjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 164
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 178
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget v3, p1, v0
a=0;// 
a=0;//     .line 176
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/tencent/feedback/common/service/a;->a(ILjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 175
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 177
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([JLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 197
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-wide v3, p1, v0
a=0;// 
a=0;//     .line 195
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4, v5}, Lcom/tencent/feedback/common/service/a;->a(JLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 194
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v5}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 278
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 274
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 275
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     .line 276
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 275
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 277
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([SLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/feedback/common/service/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "null\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 159
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", []\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", [\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v1, Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/feedback/common/service/a;);
a=0;//     iget-object v0, p0, Lcom/tencent/feedback/common/service/a;->a:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/feedback/common/service/a;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Lcom/tencent/feedback/common/service/a;-><init>(Ljava/lang/StringBuilder;I)V
a=0;// 
a=0;//     .line 156
a=0;//     #v1=(Reference,Lcom/tencent/feedback/common/service/a;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-short v3, p1, v0
a=0;// 
a=0;//     .line 157
a=0;//     #v3=(Short);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/tencent/feedback/common/service/a;->a(SLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     .line 156
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 158
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/16 v0, 0x5d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/tencent/feedback/common/service/a;->a(CLjava/lang/String;)Lcom/tencent/feedback/common/service/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
