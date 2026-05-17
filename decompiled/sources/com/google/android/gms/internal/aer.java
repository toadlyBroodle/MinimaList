package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aer extends brw<aer> {

    /* JADX INFO: renamed from: e */
    private static volatile aer[] f6533e;

    /* JADX INFO: renamed from: a */
    public String f6534a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f6535b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f6536c = null;

    /* JADX INFO: renamed from: d */
    public Integer f6537d = null;

    public aer() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aer[] m7783b() {
        if (f6533e == null) {
            synchronized (bsa.f8811b) {
                if (f6533e == null) {
                    f6533e = new aer[0];
                }
            }
        }
        return f6533e;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6534a != null) {
            iMo7775a += bru.m10113b(1, this.f6534a);
        }
        if (this.f6535b != null) {
            this.f6535b.booleanValue();
            iMo7775a += bru.m10110b(2) + 1;
        }
        if (this.f6536c != null) {
            this.f6536c.booleanValue();
            iMo7775a += bru.m10110b(3) + 1;
        }
        return this.f6537d != null ? iMo7775a + bru.m10111b(4, this.f6537d.intValue()) : iMo7775a;
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
                    this.f6534a = brtVar.m10093e();
                    break;
                case 16:
                    this.f6535b = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 24:
                    this.f6536c = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 32:
                    this.f6537d = Integer.valueOf(brtVar.m10096g());
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
        if (this.f6534a != null) {
            bruVar.m10128a(1, this.f6534a);
        }
        if (this.f6535b != null) {
            bruVar.m10129a(2, this.f6535b.booleanValue());
        }
        if (this.f6536c != null) {
            bruVar.m10129a(3, this.f6536c.booleanValue());
        }
        if (this.f6537d != null) {
            bruVar.m10125a(4, this.f6537d.intValue());
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aer)) {
            return false;
        }
        aer aerVar = (aer) obj;
        if (this.f6534a == null) {
            if (aerVar.f6534a != null) {
                return false;
            }
        } else if (!this.f6534a.equals(aerVar.f6534a)) {
            return false;
        }
        if (this.f6535b == null) {
            if (aerVar.f6535b != null) {
                return false;
            }
        } else if (!this.f6535b.equals(aerVar.f6535b)) {
            return false;
        }
        if (this.f6536c == null) {
            if (aerVar.f6536c != null) {
                return false;
            }
        } else if (!this.f6536c.equals(aerVar.f6536c)) {
            return false;
        }
        if (this.f6537d == null) {
            if (aerVar.f6537d != null) {
                return false;
            }
        } else if (!this.f6537d.equals(aerVar.f6537d)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aerVar.f8769X == null || aerVar.f8769X.m10147b() : this.f8769X.equals(aerVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6537d == null ? 0 : this.f6537d.hashCode()) + (((this.f6536c == null ? 0 : this.f6536c.hashCode()) + (((this.f6535b == null ? 0 : this.f6535b.hashCode()) + (((this.f6534a == null ? 0 : this.f6534a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
