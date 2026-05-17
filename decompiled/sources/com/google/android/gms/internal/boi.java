package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class boi extends boh {

    /* JADX INFO: renamed from: b */
    protected final byte[] f8522b;

    boi(byte[] bArr) {
        this.f8522b = bArr;
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    public byte mo9763a(int i) {
        return this.f8522b[i];
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    public int mo9764a() {
        return this.f8522b.length;
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    protected final int mo9765a(int i, int i2, int i3) {
        return bpb.m9929a(i, this.f8522b, mo9775f() + i2, i3);
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    public final bob mo9766a(int i, int i2) {
        int iB = m9759b(i, i2, mo9764a());
        return iB == 0 ? bob.f8512a : new boe(this.f8522b, mo9775f() + i, iB);
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    final void mo9767a(boa boaVar) {
        boaVar.mo9755a(this.f8522b, mo9775f(), mo9764a());
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: a */
    protected void mo9768a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f8522b, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.boh
    /* JADX INFO: renamed from: a */
    final boolean mo9778a(bob bobVar, int i, int i2) {
        if (i2 > bobVar.mo9764a()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(mo9764a()).toString());
        }
        if (i + i2 > bobVar.mo9764a()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(i).append(", ").append(i2).append(", ").append(bobVar.mo9764a()).toString());
        }
        if (!(bobVar instanceof boi)) {
            return bobVar.mo9766a(i, i + i2).equals(mo9766a(0, i2));
        }
        boi boiVar = (boi) bobVar;
        byte[] bArr = this.f8522b;
        byte[] bArr2 = boiVar.f8522b;
        int iMo9775f = mo9775f() + i2;
        int iMo9775f2 = mo9775f();
        int iMo9775f3 = boiVar.mo9775f() + i;
        while (iMo9775f2 < iMo9775f) {
            if (bArr[iMo9775f2] != bArr2[iMo9775f3]) {
                return false;
            }
            iMo9775f2++;
            iMo9775f3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.bob
    /* JADX INFO: renamed from: d */
    public final bok mo9771d() {
        return bok.m9780a(this.f8522b, mo9775f(), mo9764a(), true);
    }

    @Override // com.google.android.gms.internal.bob
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bob) && mo9764a() == ((bob) obj).mo9764a()) {
            if (mo9764a() == 0) {
                return true;
            }
            if (!(obj instanceof boi)) {
                return obj.equals(this);
            }
            int iM9772e = m9772e();
            int iM9772e2 = ((boi) obj).m9772e();
            if (iM9772e == 0 || iM9772e2 == 0 || iM9772e == iM9772e2) {
                return mo9778a((boi) obj, 0, mo9764a());
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    protected int mo9775f() {
        return 0;
    }
}
