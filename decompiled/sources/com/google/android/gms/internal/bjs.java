package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bjs {

    /* JADX INFO: renamed from: a */
    private final bfa f8287a;

    /* JADX INFO: renamed from: b */
    private final bjp f8288b;

    public bjs(bfa bfaVar, bjp bjpVar) {
        this.f8287a = bfaVar;
        this.f8288b = bjpVar;
    }

    /* JADX INFO: renamed from: a */
    public static bjs m9481a(bfa bfaVar) {
        return new bjs(bfaVar, bjp.f8274a);
    }

    /* JADX INFO: renamed from: a */
    public final bfa m9482a() {
        return this.f8287a;
    }

    /* JADX INFO: renamed from: b */
    public final bjp m9483b() {
        return this.f8288b;
    }

    /* JADX INFO: renamed from: c */
    public final ble m9484c() {
        return this.f8288b.m9473i();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9485d() {
        return this.f8288b.m9477m();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9486e() {
        return this.f8288b.m9476l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bjs bjsVar = (bjs) obj;
        return this.f8287a.equals(bjsVar.f8287a) && this.f8288b.equals(bjsVar.f8288b);
    }

    public final int hashCode() {
        return (this.f8287a.hashCode() * 31) + this.f8288b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8287a);
        String strValueOf2 = String.valueOf(this.f8288b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length()).append(strValueOf).append(":").append(strValueOf2).toString();
    }
}
