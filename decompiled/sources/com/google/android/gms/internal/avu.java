package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public enum avu implements bpc {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f */
    private static final bpd<avu> f7426f = new bpd<avu>() { // from class: com.google.android.gms.internal.avv
    };

    /* JADX INFO: renamed from: g */
    private final int f7428g;

    avu(int i) {
        this.f7428g = i;
    }

    /* JADX INFO: renamed from: a */
    public static avu m8533a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
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
        return this.f7428g;
    }
}
