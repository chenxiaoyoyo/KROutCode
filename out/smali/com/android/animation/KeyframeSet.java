package com.android.animation; class KeyframeSet { void a() { int a;
a=0;// .class Lcom/android/animation/KeyframeSet;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;// .field mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;// .field mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;// .field mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;// .field mNumKeyframes:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>([Lcom/android/animation/Keyframe;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/KeyframeSet;->mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v1, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat([F)Lcom/android/animation/KeyframeSet;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 70
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v3, v0, [Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     .line 71
a=0;//     #v3=(Reference,[Lcom/android/animation/Keyframe$FloatKeyframe;);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {v5}, Lcom/android/animation/Keyframe;->ofFloat(F)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 73
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget v2, p0, v4
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/android/animation/Keyframe;->ofFloat(FF)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Integer);
a=0;//     new-instance v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/FloatKeyframeSet;);
a=0;//     invoke-direct {v0, v3}, Lcom/android/animation/FloatKeyframeSet;-><init>([Lcom/android/animation/Keyframe$FloatKeyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/FloatKeyframeSet;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v4=(Null);
a=0;//     aget v0, p0, v4
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/android/animation/Keyframe;->ofFloat(FF)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v0, v4
a=0;// 
a=0;//     aget v4, p0, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lcom/android/animation/Keyframe;->ofFloat(FF)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 76
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt([I)Lcom/android/animation/KeyframeSet;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v3, v0, [Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 56
a=0;//     #v3=(Reference,[Lcom/android/animation/Keyframe$IntKeyframe;);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {v5}, Lcom/android/animation/Keyframe;->ofInt(F)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 58
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget v2, p0, v4
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/android/animation/Keyframe;->ofInt(FI)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Integer);
a=0;//     new-instance v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v0, v3}, Lcom/android/animation/IntKeyframeSet;-><init>([Lcom/android/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v4=(Null);
a=0;//     aget v0, p0, v4
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/android/animation/Keyframe;->ofInt(FI)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v0, v4
a=0;// 
a=0;//     aget v4, p0, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lcom/android/animation/Keyframe;->ofInt(FI)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 61
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe([Lcom/android/animation/Keyframe;)Lcom/android/animation/KeyframeSet;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     #v4=(Null);
a=0;//     array-length v6, p0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Boolean);v3=(Boolean);v5=(Integer);v7=(Conflicted);
a=0;//     if-ge v5, v6, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     aget-object v7, p0, v5
a=0;// 
a=0;//     #v7=(Null);
a=0;//     instance-of v7, v7, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 89
a=0;//     :goto_1
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     aget-object v7, p0, v5
a=0;// 
a=0;//     #v7=(Null);
a=0;//     instance-of v7, v7, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 93
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 95
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 99
a=0;//     new-array v1, v6, [Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     .line 100
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Reference,[Lcom/android/animation/Keyframe$FloatKeyframe;);v4=(Integer);
a=0;//     if-ge v4, v6, :cond_3
a=0;// 
a=0;//     .line 101
a=0;//     aget-object v0, p0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe$FloatKeyframe;);
a=0;//     aput-object v0, v1, v4
a=0;// 
a=0;//     .line 100
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 103
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/android/animation/FloatKeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/FloatKeyframeSet;);
a=0;//     invoke-direct {v0, v1}, Lcom/android/animation/FloatKeyframeSet;-><init>([Lcom/android/animation/Keyframe$FloatKeyframe;)V
a=0;// 
a=0;//     .line 111
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(One);v2=(Boolean);v4=(Null);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 105
a=0;//     new-array v2, v6, [Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/animation/Keyframe$IntKeyframe;);
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 106
a=0;//     :goto_4
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v6, :cond_5
a=0;// 
a=0;//     .line 107
a=0;//     aget-object v0, p0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe$IntKeyframe;);
a=0;//     aput-object v0, v2, v1
a=0;// 
a=0;//     .line 106
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 109
a=0;//     :cond_5
a=0;//     new-instance v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v0, v2}, Lcom/android/animation/IntKeyframeSet;-><init>([Lcom/android/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 111
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(One);v2=(Boolean);
a=0;//     new-instance v0, Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-direct {v0, p0}, Lcom/android/animation/KeyframeSet;-><init>([Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject([Ljava/lang/Object;)Lcom/android/animation/KeyframeSet;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 117
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v3, v0, [Lcom/android/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     .line 118
a=0;//     #v3=(Reference,[Lcom/android/animation/Keyframe$ObjectKeyframe;);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {v5}, Lcom/android/animation/Keyframe;->ofObject(F)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 120
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-object v2, p0, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Lcom/android/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);
a=0;//     new-instance v0, Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-direct {v0, v3}, Lcom/android/animation/KeyframeSet;-><init>([Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     aget-object v0, p0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v5, v0}, Lcom/android/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v0, v4
a=0;// 
a=0;//     aget-object v4, p0, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0, v4}, Lcom/android/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v0, v3, v1
a=0;// 
a=0;//     .line 123
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/android/animation/KeyframeSet;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v2, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 146
a=0;//     #v3=(Integer);
a=0;//     new-array v4, v3, [Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 147
a=0;//     #v4=(Reference,[Lcom/android/animation/Keyframe;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->clone()Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     .line 147
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/KeyframeSet;);
a=0;//     invoke-direct {v0, v4}, Lcom/android/animation/KeyframeSet;-><init>([Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0}, Lcom/android/animation/KeyframeSet;->clone()Lcom/android/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/KeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue(F)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 169
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/animation/KeyframeSet;->mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, p1, v1, v2}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Integer);v2=(PosByte);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpg-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_3
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v1, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 179
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 182
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/android/animation/KeyframeSet;->mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 183
a=0;//     #v1=(Float);
a=0;//     sub-float v2, p1, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float v1, v3, v1
a=0;// 
a=0;//     div-float v1, v2, v1
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v2, p0, Lcom/android/animation/KeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     iget-object v3, p0, Lcom/android/animation/KeyframeSet;->mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2, v1, v3, v0}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Byte);v2=(PosByte);v3=(Uninit);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_5
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v1, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 191
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 193
a=0;//     :cond_4
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Float);
a=0;//     sub-float v2, p1, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float v1, v3, v1
a=0;// 
a=0;//     div-float v1, v2, v1
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v2, p0, Lcom/android/animation/KeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v3}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v1, v0, v3}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_5
a=0;//     #v0=(One);v1=(Byte);v2=(PosByte);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/android/animation/KeyframeSet;->mFirstKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 200
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iget v0, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_8
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, p1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_7
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 204
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 205
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_6
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 208
a=0;//     #v1=(Float);
a=0;//     sub-float v3, p1, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float v1, v4, v1
a=0;// 
a=0;//     div-float v1, v3, v1
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v3, p0, Lcom/android/animation/KeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v3, v1, v2, v0}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_7
a=0;//     #v1=(Integer);v3=(Byte);v4=(Uninit);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 216
a=0;//     :cond_8
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mLastKeyframe:Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe;);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEvaluator(Lcom/android/animation/TypeEvaluator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iput-object p1, p0, Lcom/android/animation/KeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 222
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     iget v2, p0, Lcom/android/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/android/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 222
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     return-object v0
a=0;// .end method
}}
