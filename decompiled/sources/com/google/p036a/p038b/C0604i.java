package com.google.p036a.p038b;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.a.b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0604i {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f4201a;

    /* JADX INFO: renamed from: b */
    private static final Map<Class<?>, Class<?>> f4202b;

    static {
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        m5188a(map, map2, Boolean.TYPE, Boolean.class);
        m5188a(map, map2, Byte.TYPE, Byte.class);
        m5188a(map, map2, Character.TYPE, Character.class);
        m5188a(map, map2, Double.TYPE, Double.class);
        m5188a(map, map2, Float.TYPE, Float.class);
        m5188a(map, map2, Integer.TYPE, Integer.class);
        m5188a(map, map2, Long.TYPE, Long.class);
        m5188a(map, map2, Short.TYPE, Short.class);
        m5188a(map, map2, Void.TYPE, Void.class);
        f4201a = Collections.unmodifiableMap(map);
        f4202b = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    private static void m5188a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5189a(Type type) {
        return f4201a.containsKey(type);
    }
}
