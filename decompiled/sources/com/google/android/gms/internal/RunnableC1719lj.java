package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.lj */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1719lj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10940a;

    RunnableC1719lj(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10940a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10940a.f10930r != null) {
            this.f10940a.f10930r.mo11694d();
            this.f10940a.f10930r.mo11696f();
        }
    }
}
