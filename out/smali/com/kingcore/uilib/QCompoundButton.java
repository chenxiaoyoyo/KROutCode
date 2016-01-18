package com.kingcore.uilib; class QCompoundButton { void a() { int a;
a=0;// .class public abstract Lcom/kingcore/uilib/QCompoundButton;
a=0;// .super Landroid/widget/CompoundButton;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bL:Z
a=0;// 
a=0;// .field protected bM:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 19
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/QCompoundButton;);
a=0;//     iput-boolean v1, p0, Lcom/kingcore/uilib/QCompoundButton;->bL:Z
a=0;// 
a=0;//     .line 16
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bM:Z
a=0;// 
a=0;//     .line 20
a=0;//     invoke-virtual {p0, v1}, Lcom/kingcore/uilib/QCompoundButton;->setClickable(Z)V
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 24
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/kingcore/uilib/QCompoundButton;);
a=0;//     iput-boolean v1, p0, Lcom/kingcore/uilib/QCompoundButton;->bL:Z
a=0;// 
a=0;//     .line 16
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bM:Z
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p0, v1}, Lcom/kingcore/uilib/QCompoundButton;->setClickable(Z)V
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ae()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bL:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performClick()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bL:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bM:Z
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/widget/CompoundButton;->performClick()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/kingcore/uilib/QCompoundButton;->bM:Z
a=0;// 
a=0;//     .line 61
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toggle()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-boolean v0, p0, Lcom/kingcore/uilib/QCompoundButton;->bM:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-super {p0}, Landroid/widget/CompoundButton;->toggle()V
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
