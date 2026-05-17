package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bqn {

    /* JADX INFO: renamed from: a */
    private static final Class<?> f8659a = m9982d();

    /* JADX INFO: renamed from: b */
    private static final brb<?, ?> f8660b = m9978a(false);

    /* JADX INFO: renamed from: c */
    private static final brb<?, ?> f8661c = m9978a(true);

    /* JADX INFO: renamed from: d */
    private static final brb<?, ?> f8662d = new brd();

    /* JADX INFO: renamed from: a */
    public static brb<?, ?> m9977a() {
        return f8660b;
    }

    /* JADX INFO: renamed from: a */
    private static brb<?, ?> m9978a(boolean z) {
        try {
            Class<?> clsM9983e = m9983e();
            if (clsM9983e == null) {
                return null;
            }
            return (brb) clsM9983e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9979a(Class<?> cls) {
        if (!boz.class.isAssignableFrom(cls) && f8659a != null && !f8659a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: b */
    public static brb<?, ?> m9980b() {
        return f8661c;
    }

    /* JADX INFO: renamed from: c */
    public static brb<?, ?> m9981c() {
        return f8662d;
    }

    /* JADX INFO: renamed from: d */
    private static Class<?> m9982d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Class<?> m9983e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }
}
