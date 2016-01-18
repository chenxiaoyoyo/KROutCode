package com.kingroot.kinguser; class if { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/if;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/if;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Ljava/util/List;Ljava/util/List;)Landroid/util/SparseArray;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     .line 216
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 217
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     invoke-direct {p0, p2, p3, p4, v3}, Lcom/kingroot/kinguser/if;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Ljava/util/List;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/util/SparseArray;Landroid/util/SparseArray;Ljava/util/List;I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     invoke-virtual {p1, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p2, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 233
a=0;//     invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 234
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private af(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/gn;->cL()Lcom/kingroot/kinguser/gn;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/gn;);
a=0;//     invoke-virtual {v0, p1}, Lcom/kingroot/kinguser/gn;->X(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/if;->dH()Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/if;->o(Ljava/util/List;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 69
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-direct {p0, v1}, Lcom/kingroot/kinguser/if;->p(Ljava/util/List;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/SparseArray;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/if;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     .line 70
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/kingroot/kinguser/if;->a(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Ljava/util/List;Ljava/util/List;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 72
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 73
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v6, v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v6, v0}, Lcom/kingroot/kinguser/if;->p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget v6, v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     iget v6, v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v2, v2, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/LinkedList;);v3=(Reference,Landroid/util/SparseArray;);v4=(Reference,Ljava/util/Iterator;);v5=(Reference,Ujava/lang/Object;);
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/if;->b(Landroid/util/SparseArray;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     invoke-interface {p3}, Ljava/util/List;->clear()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/util/SparseArray;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 249
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 250
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 253
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 258
a=0;//     const-string v4, " && "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "kill -9 "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 264
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/if;->af(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 265
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "Failure"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 274
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 271
a=0;//     :cond_4
a=0;//     #v1=(Null);v2=(Reference,Ujava/lang/Object;);v3=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private dH()Ljava/util/LinkedList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/if;->v(Z)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private o(Ljava/util/List;)Landroid/util/SparseArray;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     .line 163
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 164
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/ez;->bJ()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 169
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " head /proc/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/maps"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/if;->af(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 172
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     iget-object v3, v3, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "Failure"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private p(Ljava/util/List;)Landroid/util/SparseArray;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V
a=0;// 
a=0;//     .line 187
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 188
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "cat /proc/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/environ"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/kingroot/kinguser/if;->af(Ljava/lang/String;)Lcom/kingroot/kinguser/wo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v4, v3, Lcom/kingroot/kinguser/wo;->vs:Ljava/lang/String;
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v3}, Lcom/kingroot/kinguser/wo;->mb()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->pid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_2
a=0;//     iget v0, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 209
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 286
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 297
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private v(Z)Ljava/util/LinkedList;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/util/ProcessUtils;->K(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     new-instance v1, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;
a=0;// 
a=0;//     .line 113
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->ppid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     iget v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->uid:I
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "ku.sud"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/kinguser/if;->p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "daemonsu"
a=0;// 
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/kinguser/if;->p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v3, v0, Lcom/kingroot/kinguser/util/ProcessUtils$ProcessInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "kuInotify"
a=0;// 
a=0;//     invoke-direct {p0, v3, v4}, Lcom/kingroot/kinguser/if;->p(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/kingroot/kinguser/if;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 62
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
