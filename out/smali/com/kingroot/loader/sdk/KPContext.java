package com.kingroot.loader.sdk; class KPContext { void a() { int a;
a=0;// .class public Lcom/kingroot/loader/sdk/KPContext;
a=0;// .super Landroid/content/ContextWrapper;
a=0;// # done
a=0;// 
a=0;// # instance fields
a=0;// .field private mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mBirdge:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;// .field private mClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;// .field private mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;// .field private mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private final mLayoutInflaterLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private mMetaData:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mResource:Landroid/content/res/Resources;
a=0;// 
a=0;// .field private mTheme:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/ClassLoader;Landroid/content/Context;Lcom/kingroot/loader/sdk/KPPackage;Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/kingroot/loader/sdk/KPContext;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflaterLock:Ljava/lang/Object;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/kingroot/loader/sdk/KPContext;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/kingroot/loader/sdk/KPContext;->mClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mMetaData:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mBirdge:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p3}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginSourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2, v0}, Lcom/kingroot/kinguser/afl;->u(Landroid/content/Context;Ljava/lang/String;)Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mResource:Landroid/content/res/Resources;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mResource:Landroid/content/res/Resources;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mTheme:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     sget v0, Lcom/kingroot/kinguser/afk;->GU:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mTheme:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);
a=0;//     sget v1, Lcom/kingroot/kinguser/afk;->GU:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getBridgeObj()Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mBirdge:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mBirdge:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getApplicationContext()Landroid/content/Context;
a=0;//     .locals 0
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0}, Landroid/content/ContextWrapper;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginBaseDataPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginSourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginLibPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginSourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mMetaData:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAssets()Landroid/content/res/AssetManager;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mResource:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCacheDir()Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginBaseDataPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "cache"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getClassLoader()Ljava/lang/ClassLoader;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ClassLoader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginBaseDataPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_1
a=0;//     packed-switch p2, :pswitch_data_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/io/File;->setReadable(ZZ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/kingroot/kinguser/afm;->ls()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0, v4, v3}, Ljava/io/File;->setWritable(ZZ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getFilesDir()Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v2=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v2}, Lcom/kingroot/loader/sdk/KPPackage;->getPluginBaseDataPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "files"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLayoutInflater()Landroid/view/LayoutInflater;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflaterLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mLayoutInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getLoaderApplicationContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPackage()Lcom/kingroot/loader/sdk/KPPackage;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPluginPackageName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getResources()Landroid/content/res/Resources;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mResource:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     invoke-virtual {v1}, Lcom/kingroot/loader/sdk/KPPackage;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/content/ContextWrapper;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "layout_inflater"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/kingroot/loader/sdk/KPContext;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mApplicationContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTheme()Landroid/content/res/Resources$Theme;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mTheme:Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected putMetaData(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/kingroot/loader/sdk/KPContext;->mMetaData:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public talkToLoader(Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/loader/sdk/KPContext;->getBridgeObj()Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     iget-object v1, v1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, p1}, Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;->talkToLoader(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public talkToLoader(Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/kingroot/loader/sdk/KPContext;->getBridgeObj()Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/kingroot/loader/sdk/KPContext;->mKPPackage:Lcom/kingroot/loader/sdk/KPPackage;
a=0;// 
a=0;//     #v1=(Reference,Lcom/kingroot/loader/sdk/KPPackage;);
a=0;//     iget-object v1, v1, Lcom/kingroot/loader/sdk/KPPackage;->kpInfo:Lcom/kingroot/loader/sdk/KPInfo;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/kingroot/loader/sdk/KPInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, p1, p2}, Lcom/kingroot/loader/lpinterface/IPluginToLoaderBridge;->talkToLoader(Ljava/lang/String;Landroid/os/Bundle;Lcom/kingroot/loader/lpinterface/IBridgeResultCallback;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
