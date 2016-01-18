package com.kingroot.kinguser; class aaj { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/aaj;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static Cj:I
a=0;// 
a=0;// .field public static Ck:I
a=0;// 
a=0;// .field public static Cl:I
a=0;// 
a=0;// .field public static Cm:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public Cn:J
a=0;// 
a=0;// .field public Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;// .field public Cp:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/kingroot/kinguser/aaj;->Cj:I
a=0;// 
a=0;//     .line 21
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lcom/kingroot/kinguser/aaj;->Ck:I
a=0;// 
a=0;//     .line 22
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/aaj;->Cl:I
a=0;// 
a=0;//     .line 23
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     sput v0, Lcom/kingroot/kinguser/aaj;->Cm:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/aaj;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/kingroot/kinguser/aaj;->Cn:J
a=0;// 
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aal;->mR()Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aal;);
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aaj;->Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aaj;->mN()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/aaj;->Cp:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/kingroot/kinguser/aaj;Lcom/kingroot/kinguser/aaj;Ljava/util/List;)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aaj;->Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/kinguser/aal;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aaj;->Cp:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cj:I
a=0;// 
a=0;//     .line 169
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/util/ArrayList;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/aaj;->Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p1, Lcom/kingroot/kinguser/aaj;->Cp:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 125
a=0;//     :cond_2
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cj:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aaj;->Cp:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/aaj;->Cp:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/aaj;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 129
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 130
a=0;//     invoke-interface {p2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 133
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Lcom/kingroot/kinguser/aaj;->Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/kingroot/kinguser/aaj;->Co:Lcom/kingroot/kinguser/aal;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/kingroot/kinguser/aal;->a(Lcom/kingroot/kinguser/aal;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 134
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cl:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 138
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Ck:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_6
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aaj;->mO()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 145
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aaj;->mP()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 146
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     .line 147
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 148
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 146
a=0;//     :cond_7
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_8
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 152
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 157
a=0;//     :cond_9
a=0;//     #v6=(Integer);
a=0;//     const-string v0, "/init"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 158
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cl:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt v1, v0, :cond_b
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     if-le v2, v0, :cond_b
a=0;// 
a=0;//     .line 162
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cl:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_b
a=0;//     #v0=(PosByte);
a=0;//     if-lez v2, :cond_c
a=0;// 
a=0;//     .line 166
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Cm:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_c
a=0;//     #v0=(PosByte);
a=0;//     sget v0, Lcom/kingroot/kinguser/aaj;->Ck:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v2=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 243
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     invoke-interface {p0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     .line 244
a=0;//     invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 245
a=0;//     const-string v0, "\u0000"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     .line 246
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 230
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 214
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/kingroot/kinguser/aak;
a=0;// 
a=0;//     .line 215
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 217
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/kingroot/kinguser/aak;
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aak;->a(Lcom/kingroot/kinguser/aak;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/kinguser/aak;->b(Lcom/kingroot/kinguser/aak;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 225
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, v0, Lcom/kingroot/kinguser/aak;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 230
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v3=(Null);v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static mM()Lcom/kingroot/kinguser/aaj;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/kingroot/kinguser/aaj;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/kinguser/aaj;);
a=0;//     invoke-direct {v0}, Lcom/kingroot/kinguser/aaj;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Lcom/kingroot/kinguser/aaj;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static mN()Ljava/util/ArrayList;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aaj;->mO()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/aaj;->mP()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 53
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 57
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     const-string v0, "/proc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->list()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 59
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     array-length v1, v6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     return-object v4
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     aget-object v1, v6, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v7, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 59
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v8, "cmdline"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 76
a=0;//     invoke-static {v2}, Lcom/kingroot/kinguser/uu;->q(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_6
a=0;// 
a=0;//     .line 83
a=0;//     :goto_2
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v8, "comm"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->canRead()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 86
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/uu;->q(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 87
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_5
a=0;// 
a=0;//     .line 94
a=0;//     :goto_3
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 95
a=0;//     invoke-static {v3, v1}, Lcom/kingroot/kinguser/aaj;->a(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 99
a=0;//     :cond_4
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v8, "stat"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1, v2}, Lcom/kingroot/kinguser/aak;->d(Ljava/lang/String;Ljava/io/File;)Lcom/kingroot/kinguser/aak;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 102
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Integer);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static mO()Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "/init"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 179
a=0;//     const-string v1, "/sbin/ueventd"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 180
a=0;//     const-string v1, "/system/bin/vold"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "/system/bin/netd"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 182
a=0;//     const-string v1, "/system/bin/debuggerd"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 183
a=0;//     const-string v1, "/system/bin/rild"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "/system/bin/installd"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 185
a=0;//     const-string v1, "/system/bin/keystore"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 186
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static mP()Ljava/util/List;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "/system/bin/servicemanager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 196
a=0;//     const-string v1, "/system/bin/surfaceflinger"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 197
a=0;//     const-string v1, "zygote"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 198
a=0;//     const-string v1, "system_server"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 199
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public mQ()J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/kingroot/kinguser/aaj;->Cn:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     return-wide v0
a=0;// .end method
}}
