package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class boq {

    /* JADX INFO: renamed from: a */
    private static Class<?> f8544a = m9873b();

    /* JADX INFO: renamed from: a */
    public static bor m9871a() {
        if (f8544a != null) {
            try {
                return m9872a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return bor.f8545a;
    }

    /* JADX INFO: renamed from: a */
    private static final bor m9872a(String str) {
        return (bor) f8544a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    private static Class<?> m9873b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
