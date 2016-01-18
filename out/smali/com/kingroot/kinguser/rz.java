package com.kingroot.kinguser; class rz { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/rz;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/acu;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final rB:Ljava/lang/String;
a=0;// 
a=0;// .field public static final rC:Ljava/lang/String;
a=0;// 
a=0;// .field public static final rD:Ljava/lang/String;
a=0;// 
a=0;// .field public static final rE:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile rF:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;// .field private static rM:Ljava/util/Set;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;// .field private rH:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private rI:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private rJ:Z
a=0;// 
a=0;// .field private final rK:Ljava/lang/Object;
a=0;// 
a=0;// .field private final rL:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const-string v0, "s1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "s2"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rC:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "s3"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "s4"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/fv;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rE:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/rz;->rJ:Z
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->rK:Ljava/lang/Object;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->rL:Ljava/lang/Object;
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sb;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/sb;-><init>(Lcom/kingroot/kinguser/rz;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private A(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 768
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/eq;->bv()Lcom/kingroot/kinguser/eq;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/eq;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/eq;->bw()V
a=0;// 
a=0;//     .line 769
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 668
a=0;//     iget-object v0, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 669
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 670
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 673
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/kingroot/kinguser/rz;->rE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1, v0, v2}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 676
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f0a002a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 677
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a000d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 678
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 680
a=0;//     iget-object v1, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/fx;->h(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 683
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kn;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/16 v7, 0x64
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/kingroot/kinguser/kn;-><init>(JJLjava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 684
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kn;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gg;->a(Lcom/kingroot/kinguser/kn;)V
a=0;// 
a=0;//     .line 685
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 713
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 714
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 715
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 718
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rC:Ljava/lang/String;
a=0;// 
a=0;//     .line 719
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v5, v1, v2, v0}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 722
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 748
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 719
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 727
a=0;//     :cond_1
a=0;//     iget v2, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v2, v0}, Lcom/kingroot/kinguser/rz;->j(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 728
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 729
a=0;//     if-eqz p5, :cond_4
a=0;// 
a=0;//     .line 732
a=0;//     iget-object v0, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p5, v0}, Lcom/kingroot/kinguser/fx;->h(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 745
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p3, :cond_6
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 746
a=0;//     :goto_4
a=0;//     #v8=(PosByte);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kn;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/16 v7, 0x64
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/kingroot/kinguser/kn;-><init>(JJLjava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 747
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kn;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gg;->a(Lcom/kingroot/kinguser/kn;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 727
a=0;//     :cond_3
a=0;//     #v1=(Null);v2=(Integer);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 735
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v1, 0x7f0a002a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 736
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a002b
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 737
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v3, 0x7f0a000d
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 738
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 739
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 740
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     :goto_5
a=0;//     iget-object v1, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/fx;->h(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 745
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/kingroot/kinguser/jc;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nk;->ip()Lcom/kingroot/kinguser/nk;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nk;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nk;->iu()V
a=0;// 
a=0;//     .line 776
a=0;//     invoke-virtual {p1}, Lcom/kingroot/kinguser/jc;->eH()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 784
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 780
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kx;->hn()Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kx;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kx;->ap(Z)V
a=0;// 
a=0;//     .line 783
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nq;->iB()Lcom/kingroot/kinguser/nq;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nq;->in()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/kingroot/kinguser/rz;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/rz;->d(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/Set;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/rz;->jx()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0}, Lcom/kingroot/kinguser/tm;->a(Ljava/lang/Object;Ljava/io/File;)V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 689
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     .line 690
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     .line 691
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     .line 694
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2, v0, v1}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 697
a=0;//     iget v0, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v2}, Lcom/kingroot/kinguser/rz;->j(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 698
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 700
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v1, 0x7f0a002a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 701
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v2, 0x7f0a000d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 702
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 703
a=0;//     iget-object v1, p2, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/fx;->h(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 707
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/kingroot/kinguser/kn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/kn;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/16 v7, 0x64
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/kingroot/kinguser/kn;-><init>(JJLjava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 708
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kn;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gg;->cy()Lcom/kingroot/kinguser/gg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/gg;);
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/gg;->a(Lcom/kingroot/kinguser/kn;)V
a=0;// 
a=0;//     .line 709
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/kingroot/kinguser/rz;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/rz;->e(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 225
a=0;//     #v6=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/mn;->ie()Lcom/kingroot/kinguser/mn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/mn;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/mn;->at(Z)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 230
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v6, v0}, Lcom/kingroot/kinguser/jc;->B(Z)V
a=0;// 
a=0;//     .line 391
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/lb;->bh(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 236
a=0;//     #v7=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/fz;->U(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/nn;->iv()Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/nn;->iw()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/rz;->m(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kt;->hi()Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kt;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/kingroot/kinguser/kt;->bf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 251
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v7, v0, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "S_DENY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Integer);v3=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v8, v0, :cond_3
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "S_DENY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Integer);v3=(Uninit);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v7, v0, :cond_4
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_4
a=0;//     #v0=(PosByte);v1=(Integer);v3=(Uninit);
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/kinguser/rz;->k(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rB:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 281
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 284
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_7
a=0;// 
a=0;//     .line 286
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_7
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 323
a=0;//     packed-switch v7, :pswitch_data_1
a=0;// 
a=0;//     .line 355
a=0;//     :cond_8
a=0;//     :goto_2
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/rz;->l(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/rz;->b(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 360
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->a(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 361
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 366
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/en;->bo()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 367
a=0;//     const/16 v0, 0x63
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v8, v0, :cond_d
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;// 
a=0;//     .line 370
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->a(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 376
a=0;//     :goto_3
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 380
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 384
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/rz;->jz()V
a=0;// 
a=0;//     .line 388
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0, v6}, Lcom/kingroot/kinguser/rz;->a(Lcom/kingroot/kinguser/jc;)V
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/rz;->A(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 289
a=0;//     :pswitch_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v7, v0, :cond_c
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 295
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 297
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 293
a=0;//     :cond_c
a=0;//     #v0=(PosByte);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 300
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 303
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 308
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 309
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/rz;->jz()V
a=0;// 
a=0;//     .line 311
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 325
a=0;//     :pswitch_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->eH()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/rz;->b(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 328
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->a(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 329
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 335
a=0;//     :pswitch_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v6}, Lcom/kingroot/kinguser/jc;->eH()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;// 
a=0;//     .line 338
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->b(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 339
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 345
a=0;//     :pswitch_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;// 
a=0;//     .line 347
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->a(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 348
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 349
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 373
a=0;//     :cond_d
a=0;//     #v0=(PosByte);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/rz;->a(Landroid/content/Context;Lcom/kingroot/kinguser/model/SuRequestCmdModel;ZZLjava/lang/String;)V
a=0;// 
a=0;//     .line 374
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kingroot/kinguser/fz;->b(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 286
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 323
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized e(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 475
a=0;//     #v3=(One);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 478
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->eB()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 519
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 484
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kx;->hn()Lcom/kingroot/kinguser/kx;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/kx;);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/kx;->bf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 486
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "S_DENY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 475
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 491
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/kt;->hi()Lcom/kingroot/kinguser/kt;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/kt;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/kt;->bf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 492
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "S_DENY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 497
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v3=(One);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 499
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rE:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 504
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(PosByte);v3=(One);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 505
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/fz;->V(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 506
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 510
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Boolean);v3=(One);
a=0;//     if-ne v0, v3, :cond_5
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v0, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rz;->rD:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 517
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Boolean);v3=(One);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rC:Ljava/lang/String;
a=0;// 
a=0;//     .line 518
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p1, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v0}, Lcom/kingroot/kinguser/rx;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private j(II)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 752
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 753
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iget-wide v3, v3, Lcom/kingroot/kinguser/sb;->kK:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v3, v1, v3
a=0;// 
a=0;//     .line 754
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/sb;->rO:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, p1, :cond_0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/sb;->rP:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, p2, :cond_0
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v5, v3, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_0
a=0;// 
a=0;//     const-wide/16 v5, 0xfa0
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     .line 755
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iget v4, v3, Lcom/kingroot/kinguser/sb;->rQ:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, v3, Lcom/kingroot/kinguser/sb;->rQ:I
a=0;// 
a=0;//     .line 756
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     iput-wide v1, v3, Lcom/kingroot/kinguser/sb;->kK:J
a=0;// 
a=0;//     .line 763
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iget v1, v1, Lcom/kingroot/kinguser/sb;->rQ:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 758
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(LongLo);v2=(LongHi);v3=(Conflicted);v4=(LongHi);
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/sb;);
a=0;//     iput p1, v3, Lcom/kingroot/kinguser/sb;->rO:I
a=0;// 
a=0;//     .line 759
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     iput p2, v3, Lcom/kingroot/kinguser/sb;->rP:I
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     iput v0, v3, Lcom/kingroot/kinguser/sb;->rQ:I
a=0;// 
a=0;//     .line 761
a=0;//     iget-object v3, p0, Lcom/kingroot/kinguser/rz;->rG:Lcom/kingroot/kinguser/sb;
a=0;// 
a=0;//     iput-wide v1, v3, Lcom/kingroot/kinguser/sb;->kK:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 763
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(PosByte);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static jA()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 523
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 524
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 527
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 528
a=0;//     aget-object v2, v1, v0
a=0;// 
a=0;//     .line 529
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 530
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     const-string v4, "user"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const-string v4, ".log"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 531
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 527
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 534
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 536
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private jw()Ljava/util/Set;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rL:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/rz;->jx()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tm;->k(Ljava/io/File;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v2, v0, Ljava/util/Set;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     :try_start_1
a=0;//     check-cast v0, Ljava/util/Set;
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rM:Ljava/util/Set;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 86
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 77
a=0;//     :catch_0
a=0;//     #v2=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static jx()Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/tsset.dat"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static jy()Lcom/kingroot/kinguser/rz;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rF:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     const-class v1, Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 141
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rF:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/rz;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/rz;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/rz;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/rz;->rF:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/rz;->rF:Lcom/kingroot/kinguser/rz;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 144
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static k(Ljava/lang/String;I)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 543
a=0;//     #v0=(One);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :pswitch_0
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 621
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 546
a=0;//     :pswitch_1
a=0;//     #v0=(One);v2=(Uninit);
a=0;//     const-string v2, "com.qq.AppService"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 552
a=0;//     :pswitch_2
a=0;//     #v2=(Uninit);
a=0;//     const-string v2, "pj.ishuaji"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 558
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);
a=0;//     const-string v2, "cn.opda.a.phonoalbumshoushou"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 566
a=0;//     :pswitch_4
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/rz;->m(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 570
a=0;//     const-string v2, "com.shuame.sprite"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.android.ss"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.shuame.romupdate"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.shuame.mobile"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.shuame.mobile.tv"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.shuame.rootgenius"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "com.shuame.rootgenius.tv"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 584
a=0;//     :pswitch_5
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/rz;->m(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 588
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 596
a=0;//     :pswitch_6
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/rz;->m(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 600
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 608
a=0;//     :pswitch_7
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/kingroot/kinguser/rz;->m(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 614
a=0;//     :pswitch_8
a=0;//     #v2=(Uninit);
a=0;//     const-string v2, "com.xxAssistant"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 543
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_0
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static l(Ljava/lang/String;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 628
a=0;//     #v0=(Null);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 646
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 633
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     const-string v1, "com.apkol.root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "com.apkol.tool"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "com.apkol.powermaster"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "cn.netdroid.shengdiandashi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "com.wangzhuo.onekeyrom"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "com.jike.root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 639
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x4
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static m(Ljava/lang/String;I)Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 651
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 652
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 653
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->eS()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 654
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/fz;->co()Lcom/kingroot/kinguser/fz;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 655
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/fz;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vc;->la()Lcom/kingroot/kinguser/vc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/vc;);
a=0;//     const v4, 0x7f0a000e
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/kingroot/kinguser/vc;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 656
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v2, v3, p0, v4, v5}, Lcom/kingroot/kinguser/fz;->a(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 657
a=0;//     invoke-virtual {v1, v0}, Lcom/kingroot/kinguser/jc;->E(Z)V
a=0;// 
a=0;//     .line 658
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 661
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized aA(I)Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 456
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 457
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);v1=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     .line 459
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 457
a=0;//     :goto_1
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 456
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/model/SuRequestCmdModel;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized aw(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/rz;->rJ:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 396
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 395
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bq(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rK:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 98
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/rz;->jw()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 99
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/rz;->a(Ljava/util/Set;)V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public br(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rK:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 113
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/rz;->jw()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 114
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 115
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/rz;->a(Ljava/util/Set;)V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized c(Lcom/kingroot/kinguser/model/SuRequestCmdModel;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/kingroot/kinguser/sa;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/sa;);
a=0;//     invoke-direct {v0, p0}, Lcom/kingroot/kinguser/sa;-><init>(Lcom/kingroot/kinguser/rz;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/sa;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/gw;->a(Lcom/kingroot/kinguser/gx;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 215
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 157
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized jz()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/rz;->rJ:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/app/KUApplication;->ay()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 406
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rH:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/rx;->bo(Ljava/lang/String;)Landroid/net/LocalSocket;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lD:Landroid/net/LocalSocket;
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lD:Landroid/net/LocalSocket;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/rz;->rI:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 419
a=0;//     const v3, 0x3000000a
a=0;// 
a=0;//     .line 425
a=0;//     :try_start_2
a=0;//     #v3=(Integer);
a=0;//     const-string v1, "power"
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/os/PowerManager;
a=0;// 
a=0;//     const-string v4, "wk_sc"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 427
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 428
a=0;//     const-wide/16 v3, 0x4e20
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 436
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/kingroot/kinguser/activitys/SuRequestActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 437
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 438
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rn:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lC:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 439
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->ro:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->kI:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 440
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rp:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 441
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rq:Ljava/lang/String;
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lw:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 442
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rr:Ljava/lang/String;
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lx:I
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 443
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rt:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lz:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 444
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->ru:Ljava/lang/String;
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->lB:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 445
a=0;//     sget-object v3, Lcom/kingroot/kinguser/rw;->rv:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/model/SuRequestCmdModel;->ly:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 447
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 431
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/lang/SecurityException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 400
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
