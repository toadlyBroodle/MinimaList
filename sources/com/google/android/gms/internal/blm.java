package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blm {

    /* JADX INFO: renamed from: c */
    private static final blm f8382c = new blm(bkp.m9548a(), bld.m9605j());

    /* JADX INFO: renamed from: d */
    private static final blm f8383d = new blm(bkp.m9550b(), bln.f8386b);

    /* JADX INFO: renamed from: a */
    private final bkp f8384a;

    /* JADX INFO: renamed from: b */
    private final bln f8385b;

    public blm(bkp bkpVar, bln blnVar) {
        this.f8384a = bkpVar;
        this.f8385b = blnVar;
    }

    /* JADX INFO: renamed from: a */
    public static blm m9624a() {
        return f8382c;
    }

    /* JADX INFO: renamed from: b */
    public static blm m9625b() {
        return f8383d;
    }

    /* JADX INFO: renamed from: c */
    public final bkp m9626c() {
        return this.f8384a;
    }

    /* JADX INFO: renamed from: d */
    public final bln m9627d() {
        return this.f8385b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        blm blmVar = (blm) obj;
        return this.f8384a.equals(blmVar.f8384a) && this.f8385b.equals(blmVar.f8385b);
    }

    public final int hashCode() {
        return (this.f8384a.hashCode() * 31) + this.f8385b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8384a);
        String strValueOf2 = String.valueOf(this.f8385b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 23 + String.valueOf(strValueOf2).length()).append("NamedNode{name=").append(strValueOf).append(", node=").append(strValueOf2).append("}").toString();
    }
}
