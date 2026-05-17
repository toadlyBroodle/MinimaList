package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bi */
/* JADX INFO: loaded from: classes.dex */
public final class C1121bi<L> {

    /* JADX INFO: renamed from: a */
    private final L f5656a;

    /* JADX INFO: renamed from: b */
    private final String f5657b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1121bi)) {
            return false;
        }
        C1121bi c1121bi = (C1121bi) obj;
        return this.f5656a == c1121bi.f5656a && this.f5657b.equals(c1121bi.f5657b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5656a) * 31) + this.f5657b.hashCode();
    }
}
