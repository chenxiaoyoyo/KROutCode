package com.kingroot.kinguser; class lu { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/lu;
a=0;// .super Lcom/kingroot/kinguser/oa;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/lo;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/oa;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/lu;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/kingroot/kinguser/nt;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public synthetic a(Lcom/kingroot/kinguser/nz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     check-cast p1, Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/lu;->c(Lcom/kingroot/kinguser/nt;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcom/kingroot/kinguser/nt;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 600
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 601
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/oa;->c(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 607
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/nt;->ph:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 608
a=0;//     #v0=(Integer);
a=0;//     rem-int/lit8 v1, v0, 0x5
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 609
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/ek;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/ek;->w(I)V
a=0;// 
a=0;//     .line 612
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public synthetic b(Lcom/kingroot/kinguser/nz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     check-cast p1, Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/lu;->d(Lcom/kingroot/kinguser/nt;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcom/kingroot/kinguser/nt;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Lcom/kingroot/kinguser/nt;)Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     .line 618
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 620
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/oa;->a(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     .line 625
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Z)Z
a=0;// 
a=0;//     .line 628
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ek;->bf()V
a=0;// 
a=0;//     .line 639
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v0, p1, Lcom/kingroot/kinguser/nt;->pj:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, -0x1b5f
a=0;// 
a=0;//     #v1=(Short);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 651
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 630
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lo;->hE()Lcom/kingroot/kinguser/ks;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 632
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fC()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 633
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/kingroot/kinguser/jc;->C(J)V
a=0;// 
a=0;//     .line 635
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/kingroot/kinguser/lo;->b(Lcom/kingroot/kinguser/lo;Lcom/kingroot/kinguser/ks;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 642
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Short);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fB()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 643
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/jc;->P(I)V
a=0;// 
a=0;//     .line 645
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v4, v4, v1, v4}, Lcom/kingroot/kinguser/st;->a(IIIII)V
a=0;// 
a=0;//     .line 646
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 647
a=0;//     const v0, 0x18751
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 649
a=0;//     :cond_4
a=0;//     const v0, 0x1875a
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public synthetic c(Lcom/kingroot/kinguser/nz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     check-cast p1, Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/lu;->b(Lcom/kingroot/kinguser/nt;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d(Lcom/kingroot/kinguser/nt;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 655
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Lcom/kingroot/kinguser/nv;)Lcom/kingroot/kinguser/nv;
a=0;// 
a=0;//     .line 656
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Lcom/kingroot/kinguser/nt;)Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/lo;->mx:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/oa;
a=0;// 
a=0;//     .line 659
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 660
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/oa;->b(Lcom/kingroot/kinguser/nz;)V
a=0;// 
a=0;//     .line 664
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/kingroot/kinguser/jc;->P(I)V
a=0;// 
a=0;//     .line 665
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v3, v3, v1, v3}, Lcom/kingroot/kinguser/st;->a(IIIII)V
a=0;// 
a=0;//     .line 666
a=0;//     const v0, 0x1874f
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     .line 669
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/nt;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 670
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 671
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v0, v3}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;Z)Z
a=0;// 
a=0;//     .line 672
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ek;->bd()Lcom/kingroot/kinguser/ek;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/ek;->bf()V
a=0;// 
a=0;//     .line 675
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 676
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fn;->cc()Lcom/kingroot/kinguser/fn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/fn;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/lo;->a(Lcom/kingroot/kinguser/lo;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/kingroot/kinguser/fn;->f(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 688
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// 
a=0;//     .line 679
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Null);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/lu;->mO:Lcom/kingroot/kinguser/lo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/lo;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/lo;->hE()Lcom/kingroot/kinguser/ks;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 680
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/ks;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 681
a=0;//     iget-object v0, v2, Lcom/kingroot/kinguser/ks;->lS:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/kr;
a=0;// 
a=0;//     .line 682
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/kr;->lF:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 683
a=0;//     invoke-static {v2, v0, v1}, Lcom/kingroot/kinguser/lk;->a(Lcom/kingroot/kinguser/ks;Lcom/kingroot/kinguser/kr;Ljava/io/File;)V
a=0;// 
a=0;//     .line 686
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const v0, 0x18750
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/st;->aG(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public synthetic d(Lcom/kingroot/kinguser/nz;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     check-cast p1, Lcom/kingroot/kinguser/nt;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/lu;->a(Lcom/kingroot/kinguser/nt;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
