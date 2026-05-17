package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhj {

    /* JADX INFO: renamed from: a */
    private final long f8159a;

    /* JADX INFO: renamed from: b */
    private final bfa f8160b;

    /* JADX INFO: renamed from: c */
    private final bln f8161c;

    /* JADX INFO: renamed from: d */
    private final beo f8162d;

    /* JADX INFO: renamed from: e */
    private final boolean f8163e;

    public bhj(long j, bfa bfaVar, beo beoVar) {
        this.f8159a = j;
        this.f8160b = bfaVar;
        this.f8161c = null;
        this.f8162d = beoVar;
        this.f8163e = true;
    }

    public bhj(long j, bfa bfaVar, bln blnVar, boolean z) {
        this.f8159a = j;
        this.f8160b = bfaVar;
        this.f8161c = blnVar;
        this.f8162d = null;
        this.f8163e = z;
    }

    /* JADX INFO: renamed from: a */
    public final long m9308a() {
        return this.f8159a;
    }

    /* JADX INFO: renamed from: b */
    public final bfa m9309b() {
        return this.f8160b;
    }

    /* JADX INFO: renamed from: c */
    public final bln m9310c() {
        if (this.f8161c == null) {
            throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
        }
        return this.f8161c;
    }

    /* JADX INFO: renamed from: d */
    public final beo m9311d() {
        if (this.f8162d == null) {
            throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
        }
        return this.f8162d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9312e() {
        return this.f8161c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bhj bhjVar = (bhj) obj;
        if (this.f8159a == bhjVar.f8159a && this.f8160b.equals(bhjVar.f8160b) && this.f8163e == bhjVar.f8163e) {
            if (this.f8161c == null ? bhjVar.f8161c != null : !this.f8161c.equals(bhjVar.f8161c)) {
                return false;
            }
            if (this.f8162d != null) {
                if (this.f8162d.equals(bhjVar.f8162d)) {
                    return true;
                }
            } else if (bhjVar.f8162d == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9313f() {
        return this.f8163e;
    }

    public final int hashCode() {
        return (((this.f8161c != null ? this.f8161c.hashCode() : 0) + (((((Long.valueOf(this.f8159a).hashCode() * 31) + Boolean.valueOf(this.f8163e).hashCode()) * 31) + this.f8160b.hashCode()) * 31)) * 31) + (this.f8162d != null ? this.f8162d.hashCode() : 0);
    }

    public final String toString() {
        long j = this.f8159a;
        String strValueOf = String.valueOf(this.f8160b);
        boolean z = this.f8163e;
        String strValueOf2 = String.valueOf(this.f8161c);
        String strValueOf3 = String.valueOf(this.f8162d);
        return new StringBuilder(String.valueOf(strValueOf).length() + 78 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(strValueOf).append(" visible=").append(z).append(" overwrite=").append(strValueOf2).append(" merge=").append(strValueOf3).append("}").toString();
    }
}
