package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bvk {

    /* JADX INFO: renamed from: a */
    final long f9117a;

    /* JADX INFO: renamed from: b */
    final String f9118b;

    /* JADX INFO: renamed from: c */
    final int f9119c;

    bvk(long j, String str, int i) {
        this.f9117a = j;
        this.f9118b = str;
        this.f9119c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bvk)) {
            return false;
        }
        return ((bvk) obj).f9117a == this.f9117a && ((bvk) obj).f9119c == this.f9119c;
    }

    public final int hashCode() {
        return (int) this.f9117a;
    }
}
