package android.support.v4.widget; class ResourceCursorAdapter { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/widget/ResourceCursorAdapter;
a=0;// .super Landroid/support/v4/widget/CursorAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDropDownLayout:I
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mLayout:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-direct {p0, p1, p3}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ResourceCursorAdapter;);
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
a=0;// 
a=0;//     .line 56
a=0;//     const-string v0, "layout_inflater"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-direct {p0, p1, p3, p4}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 94
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ResourceCursorAdapter;);
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
a=0;// 
a=0;//     .line 95
a=0;//     const-string v0, "layout_inflater"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-direct {p0, p1, p3, p4}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ResourceCursorAdapter;);
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
a=0;// 
a=0;//     .line 78
a=0;//     const-string v0, "layout_inflater"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public newDropDownView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setDropDownViewResource(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setViewResource(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
}}
