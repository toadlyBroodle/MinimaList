package com.google.android.gms.internal;

import com.google.ads.C0631a;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class cjo {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f10179a = new int[C0631a.a.values().length];

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ int[] f10180b;

    static {
        try {
            f10179a[C0631a.a.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f10179a[C0631a.a.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f10179a[C0631a.a.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f10179a[C0631a.a.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        f10180b = new int[C0631a.b.values().length];
        try {
            f10180b[C0631a.b.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f10180b[C0631a.b.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f10180b[C0631a.b.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
    }
}
