package com.kingroot.kinguser; class hf { void a() { int a;
a=0;// .class Lcom/kingroot/kinguser/hf;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/kinguser/gx;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/kingroot/kinguser/he;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/hf;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public synthetic e(Ljava/util/List;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     invoke-virtual {p0, p1}, Lcom/kingroot/kinguser/hf;->f(Ljava/util/List;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public f(Ljava/util/List;)Ljava/lang/Boolean;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v2, v7}, Lcom/kingroot/kinguser/gn;->t(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 148
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/hg;->hG:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/kingroot/kinguser/es;->b(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v7, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v0, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 171
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Integer);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v4=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     sget-char v5, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v5=(Char);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v4, v5, v0}, Ljava/lang/String;->indexOf(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v0, v4, :cond_4
a=0;// 
a=0;//     .line 173
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "/system"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "/system/bin"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "/system/xbin"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "/data"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "chcon u:object_r:system_file:s0 "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     :pswitch_0
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/et;->fD:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/et;->fF:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_2
a=0;//     #v0=(Integer);v4=(Reference,Ljava/io/File;);v5=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Lcom/kingroot/kinguser/es;->b(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fI:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "chcon u:object_r:system_file:s0 "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 209
a=0;//     :cond_3
a=0;//     #v5=(Boolean);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fJ:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/kingroot/kinguser/et;->fK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 211
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "chcon u:object_r:system_file:s0 "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 216
a=0;//     :cond_4
a=0;//     #v4=(Byte);v5=(Char);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->b(Lcom/kingroot/kinguser/he;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/kingroot/kinguser/et;->fI:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 224
a=0;//     const-string v0, "cat %s > %s"
a=0;// 
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hK:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v7
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 228
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->c(Lcom/kingroot/kinguser/he;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v7}, Lcom/kingroot/kinguser/em;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 232
a=0;//     const-string v0, "chown %d.%d %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/hg;->hC:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/hg;->hD:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v7
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v8
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;I)I
a=0;// 
a=0;//     .line 242
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->c(Lcom/kingroot/kinguser/he;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v8}, Lcom/kingroot/kinguser/em;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 246
a=0;//     const-string v0, "chmod 0%o %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Lcom/kingroot/kinguser/hg;->mode:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v7
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 252
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->c(Lcom/kingroot/kinguser/he;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v0, v4}, Lcom/kingroot/kinguser/em;->e(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 256
a=0;//     const-string v0, "chcon %s %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v5=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hJ:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v4, v7
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 262
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/kingroot/kinguser/hg;->hI:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/hg;->hL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v7}, Lcom/kingroot/kinguser/es;->b(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 267
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/hf;->hB:Lcom/kingroot/kinguser/he;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/he;);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/he;->a(Lcom/kingroot/kinguser/he;)Lcom/kingroot/kinguser/hg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/hg;->hG:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_1
a=0;// 
a=0;//     .line 278
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Lcom/kingroot/kinguser/gn;->k(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 279
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_b
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 281
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_b
a=0;// 
a=0;//     .line 282
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     .line 284
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vr:Ljava/lang/String;
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v3, Lcom/kingroot/kinguser/et;->fI:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/et;->fL:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/es;->bx()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     sget-object v3, Lcom/kingroot/kinguser/et;->fH:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     .line 288
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 297
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 269
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v2=(Reference,Lcom/kingroot/kinguser/gn;);v3=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/et;->fE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 272
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/et;->fG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 281
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Reference,Ljava/util/List;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 294
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 297
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v2=(Reference,Lcom/kingroot/kinguser/gn;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 148
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 267
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
