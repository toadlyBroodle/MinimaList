package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.lh */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1717lh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10936a;

    RunnableC1717lh(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10936a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10936a.f10930r != null) {
            this.f10936a.f10930r.mo11689a();
        }
    }
}
