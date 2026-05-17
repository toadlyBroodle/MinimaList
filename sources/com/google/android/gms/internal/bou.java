package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bou {

    /* JADX INFO: renamed from: a */
    private static final bos<?> f8549a = new bot();

    /* JADX INFO: renamed from: b */
    private static final bos<?> f8550b = m9880c();

    /* JADX INFO: renamed from: a */
    static bos<?> m9878a() {
        return f8549a;
    }

    /* JADX INFO: renamed from: b */
    static bos<?> m9879b() {
        if (f8550b == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return f8550b;
    }

    /* JADX INFO: renamed from: c */
    private static bos<?> m9880c() {
        try {
            return (bos) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
