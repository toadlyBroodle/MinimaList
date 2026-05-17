package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aep extends brw<aep> {

    /* JADX INFO: renamed from: d */
    private static volatile aep[] f6525d;

    /* JADX INFO: renamed from: a */
    public Integer f6526a = null;

    /* JADX INFO: renamed from: b */
    public String f6527b = null;

    /* JADX INFO: renamed from: c */
    public aen f6528c = null;

    public aep() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aep[] m7781b() {
        if (f6525d == null) {
            synchronized (bsa.f8811b) {
                if (f6525d == null) {
                    f6525d = new aep[0];
                }
            }
        }
        return f6525d;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6526a != null) {
            iMo7775a += bru.m10111b(1, this.f6526a.intValue());
        }
        if (this.f6527b != null) {
            iMo7775a += bru.m10113b(2, this.f6527b);
        }
        return this.f6528c != null ? iMo7775a + bru.m10112b(3, this.f6528c) : iMo7775a;
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
                    this.f6526a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 18:
                    this.f6527b = brtVar.m10093e();
                    break;
                case 26:
                    if (this.f6528c == null) {
                        this.f6528c = new aen();
                    }
                    brtVar.m10084a(this.f6528c);
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
        if (this.f6526a != null) {
            bruVar.m10125a(1, this.f6526a.intValue());
        }
        if (this.f6527b != null) {
            bruVar.m10128a(2, this.f6527b);
        }
        if (this.f6528c != null) {
            bruVar.m10127a(3, this.f6528c);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aep)) {
            return false;
        }
        aep aepVar = (aep) obj;
        if (this.f6526a == null) {
            if (aepVar.f6526a != null) {
                return false;
            }
        } else if (!this.f6526a.equals(aepVar.f6526a)) {
            return false;
        }
        if (this.f6527b == null) {
            if (aepVar.f6527b != null) {
                return false;
            }
        } else if (!this.f6527b.equals(aepVar.f6527b)) {
            return false;
        }
        if (this.f6528c == null) {
            if (aepVar.f6528c != null) {
                return false;
            }
        } else if (!this.f6528c.equals(aepVar.f6528c)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aepVar.f8769X == null || aepVar.f8769X.m10147b() : this.f8769X.equals(aepVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = (this.f6527b == null ? 0 : this.f6527b.hashCode()) + (((this.f6526a == null ? 0 : this.f6526a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31);
        aen aenVar = this.f6528c;
        int iHashCode3 = ((aenVar == null ? 0 : aenVar.hashCode()) + (iHashCode2 * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode3 + iHashCode;
    }
}
