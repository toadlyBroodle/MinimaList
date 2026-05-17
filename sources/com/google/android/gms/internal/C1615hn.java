package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.hn */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1615hn {

    /* JADX INFO: renamed from: a */
    private boolean f10734a = false;

    /* JADX INFO: renamed from: b */
    private float f10735b = 1.0f;

    /* JADX INFO: renamed from: c */
    private final synchronized boolean m11484c() {
        return this.f10735b >= 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m11485a() {
        return m11484c() ? this.f10735b : 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11486a(float f) {
        this.f10735b = f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11487a(boolean z) {
        this.f10734a = z;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m11488b() {
        return this.f10734a;
    }
}
