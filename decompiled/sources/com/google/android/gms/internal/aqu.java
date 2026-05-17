package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aqu {

    /* JADX INFO: renamed from: a */
    private final Map<String, are> f7104a;

    /* JADX INFO: renamed from: b */
    private final are f7105b;

    private aqu(Map<String, are> map, are areVar) {
        this.f7104a = Collections.unmodifiableMap(map);
        this.f7105b = areVar;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, are> m8172a() {
        return this.f7104a;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7104a);
        String strValueOf2 = String.valueOf(this.f7105b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 32 + String.valueOf(strValueOf2).length()).append("Properties: ").append(strValueOf).append(" pushAfterEvaluate: ").append(strValueOf2).toString();
    }
}
