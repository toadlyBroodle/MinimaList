package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ll */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1721ll implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10942a;

    RunnableC1721ll(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10942a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10942a.f10930r != null) {
            this.f10942a.f10930r.mo11694d();
        }
    }
}
