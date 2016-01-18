package android.support.v4.app; class NotificationCompat$InboxStyle { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// .super Landroid/support/v4/app/NotificationCompat$Style;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 785
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V
a=0;// 
a=0;//     .line 783
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$InboxStyle;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 786
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 788
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V
a=0;// 
a=0;//     .line 783
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$InboxStyle;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 789
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/NotificationCompat$InboxStyle;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;// 
a=0;//     .line 790
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addLine(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 814
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 815
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setBigContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 797
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 798
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSummaryText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 805
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 806
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     .line 807
a=0;//     return-object p0
a=0;// .end method
}}
