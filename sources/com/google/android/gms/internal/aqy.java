package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aqy {

    /* JADX INFO: renamed from: a */
    private final List<aqu> f7108a;

    /* JADX INFO: renamed from: b */
    private final List<aqu> f7109b;

    /* JADX INFO: renamed from: c */
    private final List<aqu> f7110c;

    /* JADX INFO: renamed from: d */
    private final List<aqu> f7111d;

    private aqy(List<aqu> list, List<aqu> list2, List<aqu> list3, List<aqu> list4) {
        this.f7108a = Collections.unmodifiableList(list);
        this.f7109b = Collections.unmodifiableList(list2);
        this.f7110c = Collections.unmodifiableList(list3);
        this.f7111d = Collections.unmodifiableList(list4);
    }

    /* JADX INFO: renamed from: a */
    public final List<aqu> m8176a() {
        return this.f7108a;
    }

    /* JADX INFO: renamed from: b */
    public final List<aqu> m8177b() {
        return this.f7109b;
    }

    /* JADX INFO: renamed from: c */
    public final List<aqu> m8178c() {
        return this.f7110c;
    }

    /* JADX INFO: renamed from: d */
    public final List<aqu> m8179d() {
        return this.f7111d;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7108a);
        String strValueOf2 = String.valueOf(this.f7109b);
        String strValueOf3 = String.valueOf(this.f7110c);
        String strValueOf4 = String.valueOf(this.f7111d);
        return new StringBuilder(String.valueOf(strValueOf).length() + 71 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length()).append("Positive predicates: ").append(strValueOf).append("  Negative predicates: ").append(strValueOf2).append("  Add tags: ").append(strValueOf3).append("  Remove tags: ").append(strValueOf4).toString();
    }
}
