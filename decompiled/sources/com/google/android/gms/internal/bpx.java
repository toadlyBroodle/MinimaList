package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bpx {

    /* JADX INFO: renamed from: a */
    private static final bpv f8645a = m9959c();

    /* JADX INFO: renamed from: b */
    private static final bpv f8646b = new bpw();

    /* JADX INFO: renamed from: a */
    static bpv m9957a() {
        return f8645a;
    }

    /* JADX INFO: renamed from: b */
    static bpv m9958b() {
        return f8646b;
    }

    /* JADX INFO: renamed from: c */
    private static bpv m9959c() {
        try {
            return (bpv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
