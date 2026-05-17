package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class atm {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f7243a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f7244b;

    /* JADX INFO: renamed from: c */
    static final /* synthetic */ int[] f7245c = new int[aus.values().length];

    static {
        try {
            f7245c[aus.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f7245c[aus.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        f7244b = new int[avg.values().length];
        try {
            f7244b[avg.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f7244b[avg.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f7244b[avg.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        f7243a = new int[avi.values().length];
        try {
            f7243a[avi.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f7243a[avi.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f7243a[avi.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
    }
}
