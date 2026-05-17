package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public enum awm implements bpc {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g */
    private static final bpd<awm> f7493g = new bpd<awm>() { // from class: com.google.android.gms.internal.awn
    };

    /* JADX INFO: renamed from: h */
    private final int f7495h;

    awm(int i) {
        this.f7495h = i;
    }

    /* JADX INFO: renamed from: a */
    public static awm m8627a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
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
        return this.f7495h;
    }
}
