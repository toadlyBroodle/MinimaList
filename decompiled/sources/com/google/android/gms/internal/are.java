package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class are {

    /* JADX INFO: renamed from: a */
    private static final String f7133a = new String("");

    /* JADX INFO: renamed from: b */
    private static final Integer f7134b = 0;

    /* JADX INFO: renamed from: c */
    private final int f7135c;

    /* JADX INFO: renamed from: d */
    private final Object f7136d;

    /* JADX INFO: renamed from: e */
    private final List<Integer> f7137e;

    /* JADX INFO: renamed from: f */
    private final boolean f7138f;

    private are(Integer num, Object obj, List<Integer> list, boolean z) {
        this.f7135c = num.intValue();
        this.f7136d = obj;
        this.f7137e = Collections.unmodifiableList(list);
        this.f7138f = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m8198a() {
        return this.f7135c;
    }

    /* JADX INFO: renamed from: b */
    public final Object m8199b() {
        return this.f7136d;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m8200c() {
        return this.f7137e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof are) && ((are) obj).f7136d.equals(this.f7136d);
    }

    public final int hashCode() {
        return this.f7136d.hashCode();
    }

    public final String toString() {
        if (this.f7136d != null) {
            return this.f7136d.toString();
        }
        ahs.m7942a("Fail to convert a null object to string");
        return f7133a;
    }
}
