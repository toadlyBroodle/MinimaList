package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.yj */
/* JADX INFO: loaded from: classes.dex */
public final class C2070yj extends AbstractC2011we {
    public static final Parcelable.Creator<C2070yj> CREATOR = new C2071yk();

    /* JADX INFO: renamed from: a */
    private int f12529a;

    /* JADX INFO: renamed from: b */
    private C1937tl f12530b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f12531c;

    C2070yj(int i, byte[] bArr) {
        this.f12529a = i;
        this.f12531c = bArr;
        m12603b();
    }

    /* JADX INFO: renamed from: b */
    private final void m12603b() {
        if (this.f12530b != null || this.f12531c == null) {
            if (this.f12530b == null || this.f12531c != null) {
                if (this.f12530b != null && this.f12531c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.f12530b != null || this.f12531c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1937tl m12604a() {
        if (!(this.f12530b != null)) {
            try {
                this.f12530b = (C1937tl) bsc.m10162a(new C1937tl(), this.f12531c);
                this.f12531c = null;
            } catch (bsb e) {
                throw new IllegalStateException(e);
            }
        }
        m12603b();
        return this.f12530b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f12529a);
        C2014wh.m12527a(parcel, 2, this.f12531c != null ? this.f12531c : bsc.m10164a(this.f12530b), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
