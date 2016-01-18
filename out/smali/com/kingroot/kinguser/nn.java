package com.kingroot.kinguser; class nn { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/nn;
a=0;// .super Lcom/kingroot/kinguser/nf;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile oF:Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private kC:Ljava/lang/String;
a=0;// 
a=0;// .field private oG:Ljava/util/HashMap;
a=0;// 
a=0;// .field private oH:[I
a=0;// 
a=0;// .field private oI:I
a=0;// 
a=0;// .field private volatile oJ:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const-string v0, "BlackWhite4ChannelCloudListManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/nn;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const v0, 0x9d3b
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nf;-><init>(I)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/nn;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 30
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nn;->oH:[I
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/kingroot/kinguser/nn;->oI:I
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nn;->oJ:Z
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x4
a=0;//         0x3
a=0;//         0x1
a=0;//         0x5
a=0;//         0x2
a=0;//         0x6
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private A(Ljava/util/List;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     .line 158
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     invoke-direct {p0, p1}, Lcom/kingroot/kinguser/nn;->B(Ljava/util/List;)[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 160
a=0;//     #v2=(Reference,[I);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 161
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     aget v3, v2, v0
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     aget v1, v2, v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Reference,[I);v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private B(Ljava/util/List;)[I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oH:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v2, v0, [I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     aput v1, v2, v0
a=0;// 
a=0;//     .line 181
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 186
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/no;
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/no;->iy()Ljava/lang/String;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/no;->getType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 189
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/nn;->oH:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v0, v5, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v5, p0, Lcom/kingroot/kinguser/nn;->oH:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     aget v5, v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v4, :cond_2
a=0;// 
a=0;//     .line 191
a=0;//     aput v4, v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 189
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 197
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 202
a=0;//     :cond_5
a=0;//     #v0=(Reference,[I);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/a;Ljava/util/List;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 211
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p3, Lcom/kingroot/kinguser/a;->M:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 212
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p3, Lcom/kingroot/kinguser/a;->N:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/kingroot/kinguser/nn;->oI:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 217
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/kingroot/kinguser/no;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/kingroot/kinguser/no;);
a=0;//     invoke-direct {v1, p1, p2, v0}, Lcom/kingroot/kinguser/no;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 220
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/no;);
a=0;//     invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// 
a=0;//     .line 213
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static iv()Lcom/kingroot/kinguser/nn;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nn;->oF:Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nn;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     const-class v1, Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nn;->oF:Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/nn;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/nn;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/nn;);
a=0;//     sput-object v0, Lcom/kingroot/kinguser/nn;->oF:Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/kingroot/kinguser/nn;->oF:Lcom/kingroot/kinguser/nn;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 51
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
a=0;// .method private declared-synchronized ix()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     #v4=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fV()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nn;->oJ:Z
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 109
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v0, p0, Lcom/kingroot/kinguser/nn;->oJ:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Lcom/kingroot/kinguser/nn;->im()Lcom/kingroot/kinguser/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/b;->R:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/a;
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, v0, Lcom/kingroot/kinguser/a;->K:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5, v1}, Lcom/kingroot/kinguser/nn;->z(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v7, v0, Lcom/kingroot/kinguser/a;->L:Ljava/lang/String;
a=0;// 
a=0;//     .line 122
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 123
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 127
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {p0, v5, v7, v0, v1}, Lcom/kingroot/kinguser/nn;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kingroot/kinguser/a;Ljava/util/List;)V
a=0;// 
a=0;//     .line 129
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 99
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nn;->oJ:Z
a=0;// 
a=0;//     .line 138
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iput-object v5, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/a;);v1=(Reference,Ljava/util/List;);v6=(Reference,Ljava/util/Iterator;);v7=(Reference,Ljava/lang/String;);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private z(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 237
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 239
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bl(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/jc;->fV()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 70
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nn;->ix()V
a=0;// 
a=0;//     .line 73
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/kingroot/kinguser/nn;->A(Ljava/util/List;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected ik()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/nn;->oJ:Z
a=0;// 
a=0;//     .line 144
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nn;->ix()V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected il()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public iw()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/jc;->eA()Lcom/kingroot/kinguser/jc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/jc;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/jc;->fV()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/um;);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/nn;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/nn;->oG:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/nn;->ix()V
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     iget v0, p0, Lcom/kingroot/kinguser/nn;->oI:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
