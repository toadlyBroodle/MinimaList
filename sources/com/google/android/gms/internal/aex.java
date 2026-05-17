package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aex extends brw<aex> {

    /* JADX INFO: renamed from: e */
    private static volatile aex[] f6559e;

    /* JADX INFO: renamed from: a */
    public String f6560a = null;

    /* JADX INFO: renamed from: b */
    public String f6561b = null;

    /* JADX INFO: renamed from: c */
    public Long f6562c = null;

    /* JADX INFO: renamed from: f */
    private Float f6564f = null;

    /* JADX INFO: renamed from: d */
    public Double f6563d = null;

    public aex() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aex[] m7787b() {
        if (f6559e == null) {
            synchronized (bsa.f8811b) {
                if (f6559e == null) {
                    f6559e = new aex[0];
                }
            }
        }
        return f6559e;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6560a != null) {
            iMo7775a += bru.m10113b(1, this.f6560a);
        }
        if (this.f6561b != null) {
            iMo7775a += bru.m10113b(2, this.f6561b);
        }
        if (this.f6562c != null) {
            iMo7775a += bru.m10118c(3, this.f6562c.longValue());
        }
        if (this.f6564f != null) {
            this.f6564f.floatValue();
            iMo7775a += bru.m10110b(4) + 4;
        }
        if (this.f6563d == null) {
            return iMo7775a;
        }
        this.f6563d.doubleValue();
        return iMo7775a + bru.m10110b(5) + 8;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsc mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 10:
                    this.f6560a = brtVar.m10093e();
                    break;
                case 18:
                    this.f6561b = brtVar.m10093e();
                    break;
                case 24:
                    this.f6562c = Long.valueOf(brtVar.m10097h());
                    break;
                case 37:
                    this.f6564f = Float.valueOf(Float.intBitsToFloat(brtVar.m10098i()));
                    break;
                case 41:
                    this.f6563d = Double.valueOf(Double.longBitsToDouble(brtVar.m10099j()));
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
        if (this.f6560a != null) {
            bruVar.m10128a(1, this.f6560a);
        }
        if (this.f6561b != null) {
            bruVar.m10128a(2, this.f6561b);
        }
        if (this.f6562c != null) {
            bruVar.m10132b(3, this.f6562c.longValue());
        }
        if (this.f6564f != null) {
            bruVar.m10124a(4, this.f6564f.floatValue());
        }
        if (this.f6563d != null) {
            bruVar.m10123a(5, this.f6563d.doubleValue());
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aex)) {
            return false;
        }
        aex aexVar = (aex) obj;
        if (this.f6560a == null) {
            if (aexVar.f6560a != null) {
                return false;
            }
        } else if (!this.f6560a.equals(aexVar.f6560a)) {
            return false;
        }
        if (this.f6561b == null) {
            if (aexVar.f6561b != null) {
                return false;
            }
        } else if (!this.f6561b.equals(aexVar.f6561b)) {
            return false;
        }
        if (this.f6562c == null) {
            if (aexVar.f6562c != null) {
                return false;
            }
        } else if (!this.f6562c.equals(aexVar.f6562c)) {
            return false;
        }
        if (this.f6564f == null) {
            if (aexVar.f6564f != null) {
                return false;
            }
        } else if (!this.f6564f.equals(aexVar.f6564f)) {
            return false;
        }
        if (this.f6563d == null) {
            if (aexVar.f6563d != null) {
                return false;
            }
        } else if (!this.f6563d.equals(aexVar.f6563d)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aexVar.f8769X == null || aexVar.f8769X.m10147b() : this.f8769X.equals(aexVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6563d == null ? 0 : this.f6563d.hashCode()) + (((this.f6564f == null ? 0 : this.f6564f.hashCode()) + (((this.f6562c == null ? 0 : this.f6562c.hashCode()) + (((this.f6561b == null ? 0 : this.f6561b.hashCode()) + (((this.f6560a == null ? 0 : this.f6560a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
