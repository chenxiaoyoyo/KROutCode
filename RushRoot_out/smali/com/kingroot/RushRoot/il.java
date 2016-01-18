package com.kingroot.RushRoot; class il { void a() { int a;
a=0;// .class public final Lcom/kingroot/RushRoot/il;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Ljava/lang/String;
a=0;// 
a=0;// .field public static final b:Ljava/lang/String;
a=0;// 
a=0;// .field public static final c:Ljava/lang/String;
a=0;// 
a=0;// .field public static final d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0x12
a=0;// 
a=0;//     .line 10
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     const-string v0, "mount -o remount -w /system"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/il;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 11
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "htc"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "echo"
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/il;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 14
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_3
a=0;// 
a=0;//     const-string v0, "mount -o remount -w /"
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/il;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v3, :cond_4
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "htc"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "echo"
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     sput-object v0, Lcom/kingroot/RushRoot/il;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// 
a=0;//     .line 10
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const-string v0, "mount -o remount,rw /system /system"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 11
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lt v0, v2, :cond_2
a=0;// 
a=0;//     const-string v0, "mount -o remount -r /system"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "mount -o remount,ro /system /system"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 14
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "mount -o remount,rw / /"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 15
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/kingroot/RushRoot/jl;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lt v0, v2, :cond_5
a=0;// 
a=0;//     const-string v0, "mount -o remount -r /"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "mount -o remount,ro / /"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// .end method
}}
