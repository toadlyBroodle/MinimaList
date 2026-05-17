package com.google.android.gms.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdq {

    /* JADX INFO: renamed from: a */
    private final List<String> f7877a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f7878b;

    public bdq(List<String> list, Map<String, Object> map) {
        this.f7877a = list;
        this.f7878b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdq)) {
            return false;
        }
        bdq bdqVar = (bdq) obj;
        if (this.f7877a.equals(bdqVar.f7877a)) {
            return this.f7878b.equals(bdqVar.f7878b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7877a.hashCode() * 31) + this.f7878b.hashCode();
    }

    public final String toString() {
        String strM8950a = bda.m8950a(this.f7877a);
        String strValueOf = String.valueOf(this.f7878b);
        return new StringBuilder(String.valueOf(strM8950a).length() + 11 + String.valueOf(strValueOf).length()).append(strM8950a).append(" (params: ").append(strValueOf).append(")").toString();
    }
}
