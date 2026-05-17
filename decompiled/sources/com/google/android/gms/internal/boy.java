package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class boy implements bpz {

    /* JADX INFO: renamed from: a */
    private static final boy f8557a = new boy();

    /* JADX INFO: renamed from: b */
    private final Map<Class<?>, Method> f8558b = new HashMap();

    private boy() {
    }

    /* JADX INFO: renamed from: a */
    public static boy m9895a() {
        return f8557a;
    }

    @Override // com.google.android.gms.internal.bpz
    /* JADX INFO: renamed from: a */
    public final boolean mo9896a(Class<?> cls) {
        return boz.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.bpz
    /* JADX INFO: renamed from: b */
    public final bpy mo9897b(Class<?> cls) {
        if (!boz.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            Method declaredMethod = this.f8558b.get(cls);
            if (declaredMethod == null) {
                declaredMethod = cls.getDeclaredMethod("buildMessageInfo", new Class[0]);
                declaredMethod.setAccessible(true);
                this.f8558b.put(cls, declaredMethod);
            }
            return (bpy) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
