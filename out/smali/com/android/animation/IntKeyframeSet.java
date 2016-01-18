package com.android.animation; class IntKeyframeSet { void a() { int a;
a=0;// .class Lcom/android/animation/IntKeyframeSet;
a=0;// .super Lcom/android/animation/KeyframeSet;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private deltaValue:I
a=0;// 
a=0;// .field private firstTime:Z
a=0;// 
a=0;// .field private firstValue:I
a=0;// 
a=0;// .field private lastValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>([Lcom/android/animation/Keyframe$IntKeyframe;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1}, Lcom/android/animation/KeyframeSet;-><init>([Lcom/android/animation/Keyframe;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/android/animation/IntKeyframeSet;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v2, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 51
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 52
a=0;//     #v3=(Integer);
a=0;//     new-array v4, v3, [Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 53
a=0;//     #v4=(Reference,[Lcom/android/animation/Keyframe$IntKeyframe;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 54
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
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     .line 53
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v0, v4}, Lcom/android/animation/IntKeyframeSet;-><init>([Lcom/android/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/android/animation/KeyframeSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0}, Lcom/android/animation/IntKeyframeSet;->clone()Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0}, Lcom/android/animation/IntKeyframeSet;->clone()Lcom/android/animation/IntKeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/animation/IntKeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntValue(F)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v3=(Null);
a=0;//     iget v0, p0, Lcom/android/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 62
a=0;//     iget-boolean v0, p0, Lcom/android/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     iput-boolean v3, p0, Lcom/android/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/android/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/android/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     .line 66
a=0;//     iget v0, p0, Lcom/android/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     iget v1, p0, Lcom/android/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/android/animation/IntKeyframeSet;->deltaValue:I
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     iget v0, p0, Lcom/android/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/android/animation/IntKeyframeSet;->deltaValue:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/android/animation/TypeEvaluator;);v1=(Integer);v2=(PosByte);v3=(Null);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     iget v1, p0, Lcom/android/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     iget v2, p0, Lcom/android/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, p1, v1, v2}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :cond_3
a=0;//     #v1=(One);v2=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_6
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v2, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 81
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 82
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 84
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 85
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 86
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 88
a=0;//     :cond_4
a=0;//     sub-float v1, p1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v0, v4, v0
a=0;// 
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     sub-int v1, v3, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Float);v1=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     iget-object v1, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2, v3}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_6
a=0;//     #v0=(Byte);v1=(One);v2=(PosByte);v3=(Null);v4=(Uninit);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_9
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Lcom/android/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v1, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v2, p0, Lcom/android/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 98
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 100
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v1}, Lcom/android/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 101
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 102
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_7
a=0;//     sub-float v1, p1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v0, v4, v0
a=0;// 
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     sub-int v1, v3, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Float);v1=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     iget-object v1, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v0, v2, v3}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_9
a=0;//     #v0=(Byte);v1=(One);v2=(PosByte);v3=(Null);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Reference,Lcom/android/animation/Keyframe$IntKeyframe;);v3=(Byte);
a=0;//     iget v0, p0, Lcom/android/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_d
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, p1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_c
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 115
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 117
a=0;//     :cond_a
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v2}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 120
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/android/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/animation/TypeEvaluator;);
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v3, p0, Lcom/android/animation/IntKeyframeSet;->mEvaluator:Lcom/android/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v3, v1, v2, v0}, Lcom/android/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_c
a=0;//     #v0=(Reference,Lcom/android/animation/Keyframe$IntKeyframe;);v1=(Integer);v3=(Byte);v4=(Uninit);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 129
a=0;//     :cond_d
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/android/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Lcom/android/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
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
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getValue(F)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0, p1}, Lcom/android/animation/IntKeyframeSet;->getIntValue(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
}}
