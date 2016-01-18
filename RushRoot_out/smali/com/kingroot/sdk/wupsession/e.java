package com.kingroot.sdk.wupsession; class e { void a() { int a;
a=0;// .class final Lcom/kingroot/sdk/wupsession/e;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 796
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/sdk/wupsession/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 799
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/ga;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/ga;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 800
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/ga;->a()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 801
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 802
a=0;//     const-string v0, "No UnReport SUI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "has_action_stats"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 828
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 807
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v3, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     invoke-direct {v3, v0}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     .line 808
a=0;//     #v3=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     new-instance v4, Lcom/kingroot/RushRoot/gh;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/kingroot/RushRoot/gh;);
a=0;//     invoke-direct {v4, v0}, Lcom/kingroot/RushRoot/gh;-><init>(B)V
a=0;// 
a=0;//     .line 809
a=0;//     #v4=(Reference,Lcom/kingroot/RushRoot/gh;);
a=0;//     const/16 v5, 0xc
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5, v3, v4}, Lcom/kingroot/sdk/wupsession/c;->a(ILcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)V
a=0;// 
a=0;//     .line 811
a=0;//     const-string v5, "phonetype"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/kingroot/sdk/wupsession/c;->a()Lcom/kingroot/RushRoot/gp;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/kingroot/RushRoot/gp;);
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 812
a=0;//     const-string v5, "userinfo"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/kingroot/sdk/commom/c;->a(Landroid/content/Context;)Lcom/kingroot/RushRoot/hb;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 813
a=0;//     const-string v5, "suikey"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/kingroot/sdk/commom/c;->b(Landroid/content/Context;)Lcom/kingroot/RushRoot/gz;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 814
a=0;//     const-string v5, "vecsui"
a=0;// 
a=0;//     invoke-virtual {v3, v5, v2}, Lcom/kingroot/RushRoot/gh;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 815
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 817
a=0;//     :goto_1
a=0;//     #v0=(Integer);v5=(Integer);
a=0;//     if-lt v0, v5, :cond_2
a=0;// 
a=0;//     .line 821
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v3, v4}, Lcom/kingroot/sdk/wupsession/c;->a(Landroid/content/Context;Lcom/kingroot/RushRoot/gh;Lcom/kingroot/RushRoot/gh;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 822
a=0;//     #v0=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "[REPORT_RET] err = "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/kingroot/RushRoot/fi;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 823
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 824
a=0;//     iget-object v0, p0, Lcom/kingroot/sdk/wupsession/e;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "has_action_stats"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/kingroot/sdk/root/p;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 825
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/ga;->b()V
a=0;// 
a=0;//     .line 826
a=0;//     const-string v0, "Delete sui file"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 818
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 817
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
