package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.lg */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1716lg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10933a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10934b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10935c;

    RunnableC1716lg(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld, String str, String str2) {
        this.f10935c = textureViewSurfaceTextureListenerC1713ld;
        this.f10933a = str;
        this.f10934b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10935c.f10930r != null) {
            this.f10935c.f10930r.mo11691a(this.f10933a, this.f10934b);
        }
    }
}
