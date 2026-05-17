package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.lk */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1720lk implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10941a;

    RunnableC1720lk(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10941a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10941a.f10930r != null) {
            this.f10941a.f10930r.mo11693c();
        }
    }
}
