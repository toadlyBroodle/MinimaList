package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class bse {

    /* JADX INFO: renamed from: a */
    final int f8814a;

    /* JADX INFO: renamed from: b */
    final byte[] f8815b;

    bse(int i, byte[] bArr) {
        this.f8814a = i;
        this.f8815b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bse)) {
            return false;
        }
        bse bseVar = (bse) obj;
        return this.f8814a == bseVar.f8814a && Arrays.equals(this.f8815b, bseVar.f8815b);
    }

    public final int hashCode() {
        return ((this.f8814a + 527) * 31) + Arrays.hashCode(this.f8815b);
    }
}
