package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhg {

    /* JADX INFO: renamed from: a */
    private final long f8157a;

    public bhg(long j) {
        this.f8157a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m9304a() {
        return this.f8157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8157a == ((bhg) obj).f8157a;
    }

    public final int hashCode() {
        return (int) (this.f8157a ^ (this.f8157a >>> 32));
    }

    public final String toString() {
        return new StringBuilder(35).append("Tag{tagNumber=").append(this.f8157a).append("}").toString();
    }
}
