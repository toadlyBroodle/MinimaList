package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public enum avi implements bpc {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g */
    private static final bpd<avi> f7374g = new bpd<avi>() { // from class: com.google.android.gms.internal.avj
    };

    /* JADX INFO: renamed from: h */
    private final int f7376h;

    avi(int i) {
        this.f7376h = i;
    }

    /* JADX INFO: renamed from: a */
    public static avi m8483a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 2:
                return SHA224;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
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
        return this.f7376h;
    }
}
