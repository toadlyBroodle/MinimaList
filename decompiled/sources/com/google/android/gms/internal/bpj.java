package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bpj<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a */
    private Map.Entry<K, bph> f8627a;

    private bpj(Map.Entry<K, bph> entry) {
        this.f8627a = entry;
    }

    /* JADX INFO: renamed from: a */
    public final bph m9945a() {
        return this.f8627a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f8627a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8627a.getValue() == null) {
            return null;
        }
        return bph.m9944a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof bqa) {
            return this.f8627a.getValue().m9947a((bqa) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
