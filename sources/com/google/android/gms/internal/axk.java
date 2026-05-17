package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class axk {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f7538a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f7539b = new int[axl.values().length];

    static {
        try {
            f7539b[axl.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f7539b[axl.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f7539b[axl.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        f7538a = new int[axm.values().length];
        try {
            f7538a[axm.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f7538a[axm.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
    }
}
