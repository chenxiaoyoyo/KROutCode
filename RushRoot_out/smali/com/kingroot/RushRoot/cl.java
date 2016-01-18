package com.kingroot.RushRoot; class cl { void a() { int a;
a=0;// .class final Lcom/kingroot/RushRoot/cl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/kingroot/RushRoot/m;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/RushRoot/cl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final synthetic a(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0xff0000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const v5, 0xff00
a=0;// 
a=0;//     .line 128
a=0;//     #v5=(Char);
a=0;//     check-cast p2, Ljava/lang/Integer;
a=0;// 
a=0;//     check-cast p3, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, v4
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v1, v5
a=0;// 
a=0;//     shr-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     shr-int/lit8 v2, v2, 0x0
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     shr-int/lit8 v3, v3, 0x10
a=0;// 
a=0;//     #v3=(Short);
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     and-int/2addr v4, v5
a=0;// 
a=0;//     shr-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     shr-int/lit8 v5, v5, 0x0
a=0;// 
a=0;//     sub-int/2addr v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, p1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, v4, v1
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, p1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     sub-int v3, v5, v2
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, p1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "evaluate:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "rgb(%1$d,%2$d,%3$d)"
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/kingroot/RushRoot/br;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v3, 0xff
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
}}
