package com.kingroot.kinguser; class fa { void a() { int a;
a=0;// .class final Lcom/kingroot/kinguser/fa;
a=0;// .super Lcom/kingroot/kinguser/vz;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/vz;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/fa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/vz;->run()V
a=0;// 
a=0;//     .line 93
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 94
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/kingroot/kinguser/hx;->n(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v3, Lcom/kingroot/kinguser/hz;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/kingroot/kinguser/hz;);
a=0;//     invoke-direct {v3}, Lcom/kingroot/kinguser/hz;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     #v3=(Reference,Lcom/kingroot/kinguser/hz;);
a=0;//     iput v5, v3, Lcom/kingroot/kinguser/hz;->hC:I
a=0;// 
a=0;//     .line 104
a=0;//     iput v5, v3, Lcom/kingroot/kinguser/hz;->hD:I
a=0;// 
a=0;//     .line 105
a=0;//     const/16 v1, 0x1ed
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v3, Lcom/kingroot/kinguser/hz;->mode:I
a=0;// 
a=0;//     .line 106
a=0;//     const-string v1, "u:object_r:system_file:s0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v3, Lcom/kingroot/kinguser/hz;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, " zls"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4, v3}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 109
a=0;//     if-ne v1, v6, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, " zls"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4, v3}, Lcom/kingroot/kinguser/hx;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/hz;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 111
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_2
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bM()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1, v0}, Lcom/kingroot/kinguser/ez;->c(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
