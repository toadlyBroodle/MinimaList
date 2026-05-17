package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aet extends brw<aet> {

    /* JADX INFO: renamed from: c */
    private static volatile aet[] f6544c;

    /* JADX INFO: renamed from: a */
    public String f6545a = null;

    /* JADX INFO: renamed from: b */
    public String f6546b = null;

    public aet() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aet[] m7784b() {
        if (f6544c == null) {
            synchronized (bsa.f8811b) {
                if (f6544c == null) {
                    f6544c = new aet[0];
                }
            }
        }
        return f6544c;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6545a != null) {
            iMo7775a += bru.m10113b(1, this.f6545a);
        }
        return this.f6546b != null ? iMo7775a + bru.m10113b(2, this.f6546b) : iMo7775a;
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
                    this.f6545a = brtVar.m10093e();
                    break;
                case 18:
                    this.f6546b = brtVar.m10093e();
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
        if (this.f6545a != null) {
            bruVar.m10128a(1, this.f6545a);
        }
        if (this.f6546b != null) {
            bruVar.m10128a(2, this.f6546b);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aet)) {
            return false;
        }
        aet aetVar = (aet) obj;
        if (this.f6545a == null) {
            if (aetVar.f6545a != null) {
                return false;
            }
        } else if (!this.f6545a.equals(aetVar.f6545a)) {
            return false;
        }
        if (this.f6546b == null) {
            if (aetVar.f6546b != null) {
                return false;
            }
        } else if (!this.f6546b.equals(aetVar.f6546b)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aetVar.f8769X == null || aetVar.f8769X.m10147b() : this.f8769X.equals(aetVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6546b == null ? 0 : this.f6546b.hashCode()) + (((this.f6545a == null ? 0 : this.f6545a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
