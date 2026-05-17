package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.li */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1718li implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f10937a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f10938b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ TextureViewSurfaceTextureListenerC1713ld f10939c;

    RunnableC1718li(TextureViewSurfaceTextureListenerC1713ld textureViewSurfaceTextureListenerC1713ld, int i, int i2) {
        this.f10939c = textureViewSurfaceTextureListenerC1713ld;
        this.f10937a = i;
        this.f10938b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10939c.f10930r != null) {
            this.f10939c.f10930r.mo11690a(this.f10937a, this.f10938b);
        }
    }
}
