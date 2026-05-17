package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.lf */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1715lf implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10932a;

    RunnableC1715lf(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld) {
        this.f10932a = textureViewSurfaceTextureListenerC1713ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10932a.f10930r != null) {
            this.f10932a.f10930r.mo11695e();
        }
    }
}
