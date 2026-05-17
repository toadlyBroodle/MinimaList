package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnb<T, U> {

    /* JADX INFO: renamed from: a */
    private final T f8458a;

    /* JADX INFO: renamed from: b */
    private final U f8459b;

    public bnb(T t, U u) {
        this.f8458a = t;
        this.f8459b = u;
    }

    /* JADX INFO: renamed from: a */
    public final T m9687a() {
        return this.f8458a;
    }

    /* JADX INFO: renamed from: b */
    public final U m9688b() {
        return this.f8459b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bnb bnbVar = (bnb) obj;
        if (this.f8458a == null ? bnbVar.f8458a != null : !this.f8458a.equals(bnbVar.f8458a)) {
            return false;
        }
        if (this.f8459b != null) {
            if (this.f8459b.equals(bnbVar.f8459b)) {
                return true;
            }
        } else if (bnbVar.f8459b == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8458a != null ? this.f8458a.hashCode() : 0) * 31) + (this.f8459b != null ? this.f8459b.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8458a);
        String strValueOf2 = String.valueOf(this.f8459b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 7 + String.valueOf(strValueOf2).length()).append("Pair(").append(strValueOf).append(",").append(strValueOf2).append(")").toString();
    }
}
