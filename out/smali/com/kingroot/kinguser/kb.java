package com.kingroot.kinguser; class kb { void a() { int a;
a=0;// .class public Lcom/kingroot/kinguser/kb;
a=0;// .super Lcom/kingroot/kinguser/jy;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private jq:Ljava/lang/String;
a=0;// 
a=0;// .field private kC:Ljava/lang/String;
a=0;// 
a=0;// .field private kD:Ljava/lang/String;
a=0;// 
a=0;// .field private kE:Z
a=0;// 
a=0;// .field private kF:Z
a=0;// 
a=0;// .field private kG:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 5
a=0;//     invoke-direct {p0}, Lcom/kingroot/kinguser/jy;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/kinguser/kb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public aE(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aR(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public aU(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iput-object p1, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public ak(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/kb;->kE:Z
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public al(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/kb;->kF:Z
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public am(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iput-boolean p1, p0, Lcom/kingroot/kinguser/kb;->kG:Z
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Landroid/os/Bundle;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Null);
a=0;//     const-string v0, "com.kingroot.plugin.channel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "com.kingroot.plugin.kdpth"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 45
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     const-string v0, "com.kingroot.plugin.channel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     :goto_1
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "com.kingroot.plugin.kdpth"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     :goto_2
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     const-string v0, "com.kingroot.plugin.version_name"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     :goto_3
a=0;//     iput-object v0, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const-string v0, "com.kingroot.plugin.use_test_server"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/kb;->kE:Z
a=0;// 
a=0;//     .line 42
a=0;//     const-string v0, "com.kingroot.plugin.log_switch_on"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/kb;->kF:Z
a=0;// 
a=0;//     .line 43
a=0;//     const-string v0, "com.kingroot.plugin.should_show_ok_page"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/kingroot/kinguser/kb;->kG:Z
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 36
a=0;//     :cond_3
a=0;//     const-string v0, "/data/data/com.kingroot.kinguser/applib/kd"
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 39
a=0;//     :cond_4
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public gX()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public gY()Landroid/os/Bundle;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-super {p0}, Lcom/kingroot/kinguser/jy;->gY()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "com.kingroot.plugin.channel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kb;->kC:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v1, "com.kingroot.plugin.kdpth"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kb;->kD:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     const-string v1, "com.kingroot.plugin.version_name"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/kingroot/kinguser/kb;->jq:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     const-string v1, "com.kingroot.plugin.use_test_server"
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/kb;->kE:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 55
a=0;//     const-string v1, "com.kingroot.plugin.log_switch_on"
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/kb;->kF:Z
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 56
a=0;//     const-string v1, "com.kingroot.plugin.should_show_ok_page"
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/kingroot/kinguser/kb;->kG:Z
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 57
a=0;//     return-object v0
a=0;// .end method
}}
