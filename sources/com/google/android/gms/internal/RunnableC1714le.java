package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.le */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1714le implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10931a;

    RunnableC1714le(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10931a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10931a.f10930r != null) {
            this.f10931a.f10930r.mo11692b();
        }
    }
}
