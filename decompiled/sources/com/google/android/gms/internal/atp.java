package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class atp {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f7251a = new int[avi.values().length];

    static {
        try {
            f7251a[avi.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f7251a[avi.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f7251a[avi.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
