package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class boe extends boi {

    /* JADX INFO: renamed from: c */
    private final int f8518c;

    /* JADX INFO: renamed from: d */
    private final int f8519d;

    boe(byte[] bArr, int i, int i2) {
        super(bArr);
        m9759b(i, i + i2, bArr.length);
        this.f8518c = i;
        this.f8519d = i2;
    }

    @Override // com.google.android.gms.internal.boi, com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    public final byte mo9763a(int i) {
        m9762b(i, mo9764a());
        return this.f8522b[this.f8518c + i];
    }

    @Override // com.google.android.gms.internal.boi, com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    public final int mo9764a() {
        return this.f8519d;
    }

    @Override // com.google.android.gms.internal.boi, com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    protected final void mo9768a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f8522b, mo9775f() + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.boi
    /* JADX INFO: renamed from: f */
    protected final int mo9775f() {
        return this.f8518c;
    }
}
