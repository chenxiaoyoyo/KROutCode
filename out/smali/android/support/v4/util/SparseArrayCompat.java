package android.support.v4.util; class SparseArrayCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/util/SparseArrayCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DELETED:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mGarbage:Z
a=0;// 
a=0;// .field private mKeys:[I
a=0;// 
a=0;// .field private mSize:I
a=0;// 
a=0;// .field private mValues:[Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>(I)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 40
a=0;//     invoke-static {p1}, Landroid/support/v4/util/SparseArrayCompat;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 43
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 44
a=0;//     iput v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static binarySearch([IIII)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     add-int v2, p1, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 328
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     sub-int v2, v0, v1
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     .line 329
a=0;//     add-int v2, v0, v1
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     .line 331
a=0;//     aget v3, p0, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, p3, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 332
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 334
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :cond_1
a=0;//     #v3=(One);
a=0;//     add-int v1, p1, p2
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 338
a=0;//     add-int v0, p1, p2
a=0;// 
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 342
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_3
a=0;//     aget v1, p0, v0
a=0;// 
a=0;//     if-eq v1, p3, :cond_2
a=0;// 
a=0;//     .line 342
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private gc()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 118
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 119
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 121
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     .line 122
a=0;//     aget-object v6, v5, v1
a=0;// 
a=0;//     .line 124
a=0;//     #v6=(Null);
a=0;//     sget-object v7, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v6, v7, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     aget v7, v4, v1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aput v7, v4, v0
a=0;// 
a=0;//     .line 127
a=0;//     aput-object v6, v5, v0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 135
a=0;//     iput v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static idealByteArraySize(I)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     shl-int v1, v2, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0xc
a=0;// 
a=0;//     if-gt p0, v1, :cond_1
a=0;// 
a=0;//     .line 348
a=0;//     shl-int v0, v2, v0
a=0;// 
a=0;//     add-int/lit8 p0, v0, -0xc
a=0;// 
a=0;//     .line 350
a=0;//     :cond_0
a=0;//     return p0
a=0;// 
a=0;//     .line 346
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static idealIntArraySize(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     mul-int/lit8 v0, p0, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/support/v4/util/SparseArrayCompat;->idealByteArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public append(ILjava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 296
a=0;//     #v5=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt p1, v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 323
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 307
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/util/SparseArrayCompat;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 309
a=0;//     new-array v2, v1, [I
a=0;// 
a=0;//     .line 310
a=0;//     #v2=(Reference,[I);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 313
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 316
a=0;//     iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 317
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 320
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aput p1, v1, v0
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v1, v0
a=0;// 
a=0;//     .line 322
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 280
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 281
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 283
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v4, v3, v0
a=0;// 
a=0;//     .line 283
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iput v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 288
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 289
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public delete(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->binarySearch([IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(ILjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->binarySearch([IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,[Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object p2, v1, v0
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public indexOfKey(I)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 253
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->binarySearch([IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public indexOfValue(Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 273
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public keyAt(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v0, v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(ILjava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v5, v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->binarySearch([IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v1, v0
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 153
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aput p1, v1, v0
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     invoke-static {v0, v5, v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->binarySearch([IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_3
a=0;// 
a=0;//     .line 167
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/util/SparseArrayCompat;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 169
a=0;//     new-array v2, v1, [I
a=0;// 
a=0;//     .line 170
a=0;//     #v2=(Reference,[I);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 173
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 176
a=0;//     iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 177
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v1, v0
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     invoke-static {v1, v0, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     invoke-static {v1, v0, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 186
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aput p1, v1, v0
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v1, v0
a=0;// 
a=0;//     .line 188
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/SparseArrayCompat;->delete(I)V
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAt(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v1, v0, p1
a=0;// 
a=0;//     .line 96
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAtRange(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int v1, p1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V
a=0;// 
a=0;//     .line 108
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setValueAt(ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v0, p1
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public valueAt(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
