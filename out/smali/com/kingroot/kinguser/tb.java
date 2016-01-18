package com.kingroot.kinguser; class tb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/tb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static sC:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/kingroot/kinguser/tb;->sC:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/tb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static I(Ljava/util/List;)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 134
a=0;//     #v2=(Null);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 136
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     const-string v3, "|"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 142
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     instance-of v3, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 143
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/kingroot/kinguser/tb;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 172
a=0;//     :cond_2
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 175
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/kingroot/kinguser/tb;->sC:I
a=0;// 
a=0;//     if-lt v0, v1, :cond_a
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v6, v2, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 184
a=0;//     return-object v0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_4
a=0;//     #v3=(Boolean);v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     instance-of v3, v0, [Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 146
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     .line 147
a=0;//     array-length v9, v0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     if-ge v3, v9, :cond_1
a=0;// 
a=0;//     aget-object v10, v0, v3
a=0;// 
a=0;//     .line 148
a=0;//     #v10=(Null);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v4, :cond_5
a=0;// 
a=0;//     .line 149
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 151
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v10}, Lcom/kingroot/kinguser/tb;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 147
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 153
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     instance-of v3, v0, [I
a=0;// 
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 155
a=0;//     check-cast v0, [I
a=0;// 
a=0;//     check-cast v0, [I
a=0;// 
a=0;//     .line 156
a=0;//     array-length v9, v0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     if-ge v3, v9, :cond_1
a=0;// 
a=0;//     aget v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 157
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     if-lez v4, :cond_7
a=0;// 
a=0;//     .line 158
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 160
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/kingroot/kinguser/tb;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 156
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 162
a=0;//     :cond_8
a=0;//     #v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     instance-of v3, v0, Ljava/lang/Integer;
a=0;// 
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     instance-of v3, v0, Ljava/lang/Long;
a=0;// 
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     instance-of v3, v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     :cond_9
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 178
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bE(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "%3B"
a=0;// 
a=0;//     .line 113
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Lcom/kingroot/kinguser/tb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     .line 115
a=0;//     const-string v2, "%7C"
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/kinguser/tb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 117
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     .line 118
a=0;//     const-string v2, "%0A"
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {v1, v2, v0}, Lcom/kingroot/kinguser/tb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     .line 97
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p2, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     return-object p2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(IIIIILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-eqz p6, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     const-string v0, "\t"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "%09"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p6, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     const-string v2, "%0A"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p6
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 65
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 67
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/we;->lV()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/tb;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 69
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/vs;->lD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/kinguser/tb;->bE(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 71
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 73
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 74
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 76
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 77
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 79
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 81
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/um;->kJ()Lcom/kingroot/kinguser/um;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/kinguser/um;->gS()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 83
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 85
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 92
a=0;//     return-object v1
a=0;// .end method
}}
