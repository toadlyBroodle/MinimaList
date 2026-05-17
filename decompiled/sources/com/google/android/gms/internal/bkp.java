package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public class bkp implements Comparable<bkp> {

    /* JADX INFO: renamed from: b */
    private static final bkp f8331b = new bkp("[MIN_KEY]");

    /* JADX INFO: renamed from: c */
    private static final bkp f8332c = new bkp("[MAX_KEY]");

    /* JADX INFO: renamed from: d */
    private static final bkp f8333d = new bkp(".priority");

    /* JADX INFO: renamed from: e */
    private static final bkp f8334e = new bkp(".info");

    /* JADX INFO: renamed from: a */
    private final String f8335a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.bkp$a */
    static class C1434a extends bkp {

        /* JADX INFO: renamed from: a */
        private final int f8336a;

        C1434a(String str, int i) {
            super(str);
            this.f8336a = i;
        }

        @Override // com.google.android.gms.internal.bkp
        /* JADX INFO: renamed from: f */
        protected final boolean mo9556f() {
            return true;
        }

        @Override // com.google.android.gms.internal.bkp
        /* JADX INFO: renamed from: g */
        protected final int mo9557g() {
            return this.f8336a;
        }

        @Override // com.google.android.gms.internal.bkp
        public final String toString() {
            String str = super.f8335a;
            return new StringBuilder(String.valueOf(str).length() + 20).append("IntegerChildName(\"").append(str).append("\")").toString();
        }
    }

    private bkp(String str) {
        this.f8335a = str;
    }

    /* JADX INFO: renamed from: a */
    public static bkp m9548a() {
        return f8331b;
    }

    /* JADX INFO: renamed from: a */
    public static bkp m9549a(String str) {
        Integer numM9700d = bne.m9700d(str);
        return numM9700d != null ? new C1434a(str, numM9700d.intValue()) : str.equals(".priority") ? f8333d : new bkp(str);
    }

    /* JADX INFO: renamed from: b */
    public static bkp m9550b() {
        return f8332c;
    }

    /* JADX INFO: renamed from: c */
    public static bkp m9552c() {
        return f8333d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bkp bkpVar) {
        if (this == bkpVar) {
            return 0;
        }
        if (this == f8331b || bkpVar == f8332c) {
            return -1;
        }
        if (bkpVar == f8331b || this == f8332c) {
            return 1;
        }
        if (!mo9556f()) {
            if (bkpVar.mo9556f()) {
                return 1;
            }
            return this.f8335a.compareTo(bkpVar.f8335a);
        }
        if (!bkpVar.mo9556f()) {
            return -1;
        }
        int iM9691a = bne.m9691a(mo9557g(), bkpVar.mo9557g());
        return iM9691a == 0 ? bne.m9691a(this.f8335a.length(), bkpVar.f8335a.length()) : iM9691a;
    }

    /* JADX INFO: renamed from: d */
    public final String m9554d() {
        return this.f8335a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9555e() {
        return this == f8333d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bkp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f8335a.equals(((bkp) obj).f8335a);
    }

    /* JADX INFO: renamed from: f */
    protected boolean mo9556f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    protected int mo9557g() {
        return 0;
    }

    public int hashCode() {
        return this.f8335a.hashCode();
    }

    public String toString() {
        String str = this.f8335a;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }
}
