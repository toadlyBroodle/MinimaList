package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public enum aus implements bpc {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: e */
    private static final bpd<aus> f7322e = new bpd<aus>() { // from class: com.google.android.gms.internal.aut
    };

    /* JADX INFO: renamed from: f */
    private final int f7324f;

    aus(int i) {
        this.f7324f = i;
    }

    /* JADX INFO: renamed from: a */
    public static aus m8429a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
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
        return this.f7324f;
    }
}
