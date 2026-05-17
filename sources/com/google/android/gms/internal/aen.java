package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aen extends brw<aen> {

    /* JADX INFO: renamed from: e */
    private static volatile aen[] f6515e;

    /* JADX INFO: renamed from: a */
    public aeq f6516a = null;

    /* JADX INFO: renamed from: b */
    public aeo f6517b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f6518c = null;

    /* JADX INFO: renamed from: d */
    public String f6519d = null;

    public aen() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aen[] m7779b() {
        if (f6515e == null) {
            synchronized (bsa.f8811b) {
                if (f6515e == null) {
                    f6515e = new aen[0];
                }
            }
        }
        return f6515e;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6516a != null) {
            iMo7775a += bru.m10112b(1, this.f6516a);
        }
        if (this.f6517b != null) {
            iMo7775a += bru.m10112b(2, this.f6517b);
        }
        if (this.f6518c != null) {
            this.f6518c.booleanValue();
            iMo7775a += bru.m10110b(3) + 1;
        }
        return this.f6519d != null ? iMo7775a + bru.m10113b(4, this.f6519d) : iMo7775a;
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
                    if (this.f6516a == null) {
                        this.f6516a = new aeq();
                    }
                    brtVar.m10084a(this.f6516a);
                    break;
                case 18:
                    if (this.f6517b == null) {
                        this.f6517b = new aeo();
                    }
                    brtVar.m10084a(this.f6517b);
                    break;
                case 24:
                    this.f6518c = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 34:
                    this.f6519d = brtVar.m10093e();
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
        if (this.f6516a != null) {
            bruVar.m10127a(1, this.f6516a);
        }
        if (this.f6517b != null) {
            bruVar.m10127a(2, this.f6517b);
        }
        if (this.f6518c != null) {
            bruVar.m10129a(3, this.f6518c.booleanValue());
        }
        if (this.f6519d != null) {
            bruVar.m10128a(4, this.f6519d);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aen)) {
            return false;
        }
        aen aenVar = (aen) obj;
        if (this.f6516a == null) {
            if (aenVar.f6516a != null) {
                return false;
            }
        } else if (!this.f6516a.equals(aenVar.f6516a)) {
            return false;
        }
        if (this.f6517b == null) {
            if (aenVar.f6517b != null) {
                return false;
            }
        } else if (!this.f6517b.equals(aenVar.f6517b)) {
            return false;
        }
        if (this.f6518c == null) {
            if (aenVar.f6518c != null) {
                return false;
            }
        } else if (!this.f6518c.equals(aenVar.f6518c)) {
            return false;
        }
        if (this.f6519d == null) {
            if (aenVar.f6519d != null) {
                return false;
            }
        } else if (!this.f6519d.equals(aenVar.f6519d)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aenVar.f8769X == null || aenVar.f8769X.m10147b() : this.f8769X.equals(aenVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = getClass().getName().hashCode() + 527;
        aeq aeqVar = this.f6516a;
        int i = iHashCode2 * 31;
        int iHashCode3 = aeqVar == null ? 0 : aeqVar.hashCode();
        aeo aeoVar = this.f6517b;
        int iHashCode4 = ((this.f6519d == null ? 0 : this.f6519d.hashCode()) + (((this.f6518c == null ? 0 : this.f6518c.hashCode()) + (((aeoVar == null ? 0 : aeoVar.hashCode()) + ((iHashCode3 + i) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode4 + iHashCode;
    }
}
