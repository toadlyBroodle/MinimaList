package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bul implements InterfaceC1422b {

    /* JADX INFO: renamed from: a */
    private int f9035a;

    /* JADX INFO: renamed from: b */
    private int f9036b;

    /* JADX INFO: renamed from: c */
    private final int f9037c;

    /* JADX INFO: renamed from: d */
    private final float f9038d;

    public bul() {
        this(2500, 1, 1.0f);
    }

    private bul(int i, int i2, float f) {
        this.f9035a = 2500;
        this.f9037c = 1;
        this.f9038d = 1.0f;
    }

    @Override // com.google.android.gms.internal.InterfaceC1422b
    /* JADX INFO: renamed from: a */
    public final int mo8752a() {
        return this.f9035a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1422b
    /* JADX INFO: renamed from: a */
    public final void mo8753a(C1471ce c1471ce) throws C1471ce {
        this.f9036b++;
        this.f9035a = (int) (this.f9035a + (this.f9035a * this.f9038d));
        if (!(this.f9036b <= this.f9037c)) {
            throw c1471ce;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1422b
    /* JADX INFO: renamed from: b */
    public final int mo8754b() {
        return this.f9036b;
    }
}
