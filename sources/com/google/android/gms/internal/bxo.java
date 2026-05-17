package com.google.android.gms.internal;

import com.google.android.gms.ads.C0657a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class bxo extends C0657a {

    /* JADX INFO: renamed from: a */
    private final Object f9302a = new Object();

    /* JADX INFO: renamed from: b */
    private C0657a f9303b;

    @Override // com.google.android.gms.ads.C0657a
    /* JADX INFO: renamed from: a */
    public void mo4789a() {
        synchronized (this.f9302a) {
            if (this.f9303b != null) {
                this.f9303b.mo4789a();
            }
        }
    }

    @Override // com.google.android.gms.ads.C0657a
    /* JADX INFO: renamed from: a */
    public void mo5303a(int i) {
        synchronized (this.f9302a) {
            if (this.f9303b != null) {
                this.f9303b.mo5303a(i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10412a(C0657a c0657a) {
        synchronized (this.f9302a) {
            this.f9303b = c0657a;
        }
    }

    @Override // com.google.android.gms.ads.C0657a
    /* JADX INFO: renamed from: b */
    public void mo5305b() {
        synchronized (this.f9302a) {
            if (this.f9303b != null) {
                this.f9303b.mo5305b();
            }
        }
    }

    @Override // com.google.android.gms.ads.C0657a
    /* JADX INFO: renamed from: c */
    public void mo5306c() {
        synchronized (this.f9302a) {
            if (this.f9303b != null) {
                this.f9303b.mo5306c();
            }
        }
    }

    @Override // com.google.android.gms.ads.C0657a
    /* JADX INFO: renamed from: d */
    public void mo5307d() {
        synchronized (this.f9302a) {
            if (this.f9303b != null) {
                this.f9303b.mo5307d();
            }
        }
    }
}
