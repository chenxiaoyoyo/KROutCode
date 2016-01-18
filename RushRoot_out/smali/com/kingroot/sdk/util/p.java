package com.kingroot.sdk.util; class p { void a() { int a;
a=0;// .class public final Lcom/kingroot/sdk/util/p;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 27
a=0;//     #v3=(One);
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x7f
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x45
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput-byte v1, v0, v3
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     const/16 v2, 0x4c
a=0;// 
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const/16 v2, 0x46
a=0;// 
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     aput-byte v3, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     aput-byte v3, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     aput-byte v3, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/kingroot/sdk/util/p;->a:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lcom/kingroot/RushRoot/fn;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v2, "sh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Lcom/kingroot/RushRoot/fn;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 194
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);
a=0;//     const-string v1, "export PATH=/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:$PATH"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v0, p0}, Lcom/kingroot/RushRoot/fn;->a(Ljava/lang/String;)Lcom/kingroot/RushRoot/fp;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " : ret = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/fp;->d:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", stdout = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v1, Lcom/kingroot/RushRoot/fp;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", stderr = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/RushRoot/fp;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/kingroot/RushRoot/fi;->c(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 200
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Lcom/kingroot/RushRoot/fn;);v1=(Reference,Ljava/lang/Exception;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 200
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 200
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Lcom/kingroot/RushRoot/fn;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v1}, Lcom/kingroot/RushRoot/fn;->a()V
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     .line 199
a=0;//     :catchall_1
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v4, v1
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 198
a=0;//     :catch_1
a=0;//     #v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
