package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class bok {

    /* JADX INFO: renamed from: e */
    private static volatile boolean f8523e = true;

    /* JADX INFO: renamed from: a */
    int f8524a;

    /* JADX INFO: renamed from: b */
    int f8525b;

    /* JADX INFO: renamed from: c */
    int f8526c;

    /* JADX INFO: renamed from: d */
    private boolean f8527d;

    private bok() {
        this.f8525b = 100;
        this.f8526c = Integer.MAX_VALUE;
        this.f8527d = false;
    }

    /* JADX INFO: renamed from: a */
    public static bok m9779a(byte[] bArr) {
        return m9780a(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: a */
    static bok m9780a(byte[] bArr, int i, int i2, boolean z) {
        bom bomVar = new bom(bArr, i, i2, z);
        try {
            bomVar.mo9784b(i2);
            return bomVar;
        } catch (bpf e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo9781a();

    /* JADX INFO: renamed from: a */
    public abstract <T extends boz<T, ?>> T mo9782a(T t, bor borVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9783a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo9784b(int i);

    /* JADX INFO: renamed from: b */
    public abstract long mo9785b();

    /* JADX INFO: renamed from: c */
    public abstract long mo9786c();

    /* JADX INFO: renamed from: c */
    public abstract void mo9787c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo9788d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo9789e();

    /* JADX INFO: renamed from: f */
    public abstract String mo9790f();

    /* JADX INFO: renamed from: g */
    public abstract bob mo9791g();

    /* JADX INFO: renamed from: h */
    public abstract int mo9792h();

    /* JADX INFO: renamed from: i */
    public abstract int mo9793i();

    /* JADX INFO: renamed from: j */
    public abstract int mo9794j();

    /* JADX INFO: renamed from: k */
    abstract long mo9795k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo9796l();

    /* JADX INFO: renamed from: m */
    public abstract int mo9797m();
}
