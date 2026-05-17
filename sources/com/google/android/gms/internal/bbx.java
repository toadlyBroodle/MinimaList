package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bbx {

    /* JADX INFO: renamed from: a */
    private static final bbz f7760a = new bby();

    /* JADX INFO: renamed from: a */
    public static <K, V> bbw<K, V> m8879a(Comparator<K> comparator) {
        return new bbu(comparator);
    }

    /* JADX INFO: renamed from: a */
    public static <A, B, C> bbw<A, C> m8880a(List<A> list, Map<B, C> map, bbz<A, B> bbzVar, Comparator<A> comparator) {
        return list.size() < 25 ? bbu.m8858a(list, map, bbzVar, comparator) : bcm.m8920a(list, map, bbzVar, comparator);
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> bbw<A, B> m8881a(Map<A, B> map, Comparator<A> comparator) {
        return map.size() < 25 ? bbu.m8858a(new ArrayList(map.keySet()), map, f7760a, comparator) : bck.m8917a((Map) map, (Comparator) comparator);
    }

    /* JADX INFO: renamed from: a */
    public static <A> bbz<A, A> m8882a() {
        return f7760a;
    }
}
