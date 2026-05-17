package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public enum avg implements bpc {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g */
    private static final bpd<avg> f7365g = new bpd<avg>() { // from class: com.google.android.gms.internal.avh
    };

    /* JADX INFO: renamed from: h */
    private final int f7367h;

    avg(int i) {
        this.f7367h = i;
    }

    /* JADX INFO: renamed from: a */
    public static avg m8482a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    @Override // com.google.android.gms.internal.bpc
    /* JADX INFO: renamed from: a */
    public final int mo8430a() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.f7367h;
    }
}
