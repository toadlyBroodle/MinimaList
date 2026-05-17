package com.google.android.gms.common.util;

import android.support.v4.p018i.C0207a;
import android.support.v4.p018i.C0208b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.util.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1301e {
    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m7255a(K k, V v, K k2, V v2, K k3, V v3) {
        Map mapM7260b = m7260b(3, false);
        mapM7260b.put(k, v);
        mapM7260b.put(k2, v2);
        mapM7260b.put(k3, v3);
        return Collections.unmodifiableMap(mapM7260b);
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m7256a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map mapM7260b = m7260b(6, false);
        mapM7260b.put(k, v);
        mapM7260b.put(k2, v2);
        mapM7260b.put(k3, v3);
        mapM7260b.put(k4, v4);
        mapM7260b.put(k5, v5);
        mapM7260b.put(k6, v6);
        return Collections.unmodifiableMap(mapM7260b);
    }

    /* JADX INFO: renamed from: a */
    private static <T> Set<T> m7257a(int i, boolean z) {
        return i <= 256 ? new C0208b(i) : new HashSet(i, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static <T> Set<T> m7258a(T t, T t2, T t3) {
        Set setM7257a = m7257a(3, false);
        setM7257a.add(t);
        setM7257a.add(t2);
        setM7257a.add(t3);
        return Collections.unmodifiableSet(setM7257a);
    }

    /* JADX INFO: renamed from: a */
    public static <T> Set<T> m7259a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(tArr[0]);
            case 2:
                T t = tArr[0];
                T t2 = tArr[1];
                Set setM7257a = m7257a(2, false);
                setM7257a.add(t);
                setM7257a.add(t2);
                return Collections.unmodifiableSet(setM7257a);
            case 3:
                return m7258a(tArr[0], tArr[1], tArr[2]);
            case 4:
                T t3 = tArr[0];
                T t4 = tArr[1];
                T t5 = tArr[2];
                T t6 = tArr[3];
                Set setM7257a2 = m7257a(4, false);
                setM7257a2.add(t3);
                setM7257a2.add(t4);
                setM7257a2.add(t5);
                setM7257a2.add(t6);
                return Collections.unmodifiableSet(setM7257a2);
            default:
                Set setM7257a3 = m7257a(tArr.length, false);
                Collections.addAll(setM7257a3, tArr);
                return Collections.unmodifiableSet(setM7257a3);
        }
    }

    /* JADX INFO: renamed from: b */
    private static <K, V> Map<K, V> m7260b(int i, boolean z) {
        return i <= 256 ? new C0207a(i) : new HashMap(i, 1.0f);
    }
}
