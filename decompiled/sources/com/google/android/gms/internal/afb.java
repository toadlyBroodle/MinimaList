package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class afb extends brw<afb> {

    /* JADX INFO: renamed from: f */
    private static volatile afb[] f6604f;

    /* JADX INFO: renamed from: a */
    public Long f6605a = null;

    /* JADX INFO: renamed from: b */
    public String f6606b = null;

    /* JADX INFO: renamed from: c */
    public String f6607c = null;

    /* JADX INFO: renamed from: d */
    public Long f6608d = null;

    /* JADX INFO: renamed from: g */
    private Float f6610g = null;

    /* JADX INFO: renamed from: e */
    public Double f6609e = null;

    public afb() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static afb[] m7789b() {
        if (f6604f == null) {
            synchronized (bsa.f8811b) {
                if (f6604f == null) {
                    f6604f = new afb[0];
                }
            }
        }
        return f6604f;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6605a != null) {
            iMo7775a += bru.m10118c(1, this.f6605a.longValue());
        }
        if (this.f6606b != null) {
            iMo7775a += bru.m10113b(2, this.f6606b);
        }
        if (this.f6607c != null) {
            iMo7775a += bru.m10113b(3, this.f6607c);
        }
        if (this.f6608d != null) {
            iMo7775a += bru.m10118c(4, this.f6608d.longValue());
        }
        if (this.f6610g != null) {
            this.f6610g.floatValue();
            iMo7775a += bru.m10110b(5) + 4;
        }
        if (this.f6609e == null) {
            return iMo7775a;
        }
        this.f6609e.doubleValue();
        return iMo7775a + bru.m10110b(6) + 8;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsc mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 8:
                    this.f6605a = Long.valueOf(brtVar.m10097h());
                    break;
                case 18:
                    this.f6606b = brtVar.m10093e();
                    break;
                case 26:
                    this.f6607c = brtVar.m10093e();
                    break;
                case 32:
                    this.f6608d = Long.valueOf(brtVar.m10097h());
                    break;
                case 45:
                    this.f6610g = Float.valueOf(Float.intBitsToFloat(brtVar.m10098i()));
                    break;
                case 49:
                    this.f6609e = Double.valueOf(Double.longBitsToDouble(brtVar.m10099j()));
                    break;
                default:
                    if (!super.m10136a(brtVar, iM10082a)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f6605a != null) {
            bruVar.m10132b(1, this.f6605a.longValue());
        }
        if (this.f6606b != null) {
            bruVar.m10128a(2, this.f6606b);
        }
        if (this.f6607c != null) {
            bruVar.m10128a(3, this.f6607c);
        }
        if (this.f6608d != null) {
            bruVar.m10132b(4, this.f6608d.longValue());
        }
        if (this.f6610g != null) {
            bruVar.m10124a(5, this.f6610g.floatValue());
        }
        if (this.f6609e != null) {
            bruVar.m10123a(6, this.f6609e.doubleValue());
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afb)) {
            return false;
        }
        afb afbVar = (afb) obj;
        if (this.f6605a == null) {
            if (afbVar.f6605a != null) {
                return false;
            }
        } else if (!this.f6605a.equals(afbVar.f6605a)) {
            return false;
        }
        if (this.f6606b == null) {
            if (afbVar.f6606b != null) {
                return false;
            }
        } else if (!this.f6606b.equals(afbVar.f6606b)) {
            return false;
        }
        if (this.f6607c == null) {
            if (afbVar.f6607c != null) {
                return false;
            }
        } else if (!this.f6607c.equals(afbVar.f6607c)) {
            return false;
        }
        if (this.f6608d == null) {
            if (afbVar.f6608d != null) {
                return false;
            }
        } else if (!this.f6608d.equals(afbVar.f6608d)) {
            return false;
        }
        if (this.f6610g == null) {
            if (afbVar.f6610g != null) {
                return false;
            }
        } else if (!this.f6610g.equals(afbVar.f6610g)) {
            return false;
        }
        if (this.f6609e == null) {
            if (afbVar.f6609e != null) {
                return false;
            }
        } else if (!this.f6609e.equals(afbVar.f6609e)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? afbVar.f8769X == null || afbVar.f8769X.m10147b() : this.f8769X.equals(afbVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6609e == null ? 0 : this.f6609e.hashCode()) + (((this.f6610g == null ? 0 : this.f6610g.hashCode()) + (((this.f6608d == null ? 0 : this.f6608d.hashCode()) + (((this.f6607c == null ? 0 : this.f6607c.hashCode()) + (((this.f6606b == null ? 0 : this.f6606b.hashCode()) + (((this.f6605a == null ? 0 : this.f6605a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
