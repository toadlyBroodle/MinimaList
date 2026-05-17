package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aev extends brw<aev> {

    /* JADX INFO: renamed from: e */
    private static volatile aev[] f6548e;

    /* JADX INFO: renamed from: a */
    public Integer f6549a = null;

    /* JADX INFO: renamed from: b */
    public afa f6550b = null;

    /* JADX INFO: renamed from: c */
    public afa f6551c = null;

    /* JADX INFO: renamed from: d */
    public Boolean f6552d = null;

    public aev() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aev[] m7785b() {
        if (f6548e == null) {
            synchronized (bsa.f8811b) {
                if (f6548e == null) {
                    f6548e = new aev[0];
                }
            }
        }
        return f6548e;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6549a != null) {
            iMo7775a += bru.m10111b(1, this.f6549a.intValue());
        }
        if (this.f6550b != null) {
            iMo7775a += bru.m10112b(2, this.f6550b);
        }
        if (this.f6551c != null) {
            iMo7775a += bru.m10112b(3, this.f6551c);
        }
        if (this.f6552d == null) {
            return iMo7775a;
        }
        this.f6552d.booleanValue();
        return iMo7775a + bru.m10110b(4) + 1;
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
                    this.f6549a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 18:
                    if (this.f6550b == null) {
                        this.f6550b = new afa();
                    }
                    brtVar.m10084a(this.f6550b);
                    break;
                case 26:
                    if (this.f6551c == null) {
                        this.f6551c = new afa();
                    }
                    brtVar.m10084a(this.f6551c);
                    break;
                case 32:
                    this.f6552d = Boolean.valueOf(brtVar.m10092d());
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
        if (this.f6549a != null) {
            bruVar.m10125a(1, this.f6549a.intValue());
        }
        if (this.f6550b != null) {
            bruVar.m10127a(2, this.f6550b);
        }
        if (this.f6551c != null) {
            bruVar.m10127a(3, this.f6551c);
        }
        if (this.f6552d != null) {
            bruVar.m10129a(4, this.f6552d.booleanValue());
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aev)) {
            return false;
        }
        aev aevVar = (aev) obj;
        if (this.f6549a == null) {
            if (aevVar.f6549a != null) {
                return false;
            }
        } else if (!this.f6549a.equals(aevVar.f6549a)) {
            return false;
        }
        if (this.f6550b == null) {
            if (aevVar.f6550b != null) {
                return false;
            }
        } else if (!this.f6550b.equals(aevVar.f6550b)) {
            return false;
        }
        if (this.f6551c == null) {
            if (aevVar.f6551c != null) {
                return false;
            }
        } else if (!this.f6551c.equals(aevVar.f6551c)) {
            return false;
        }
        if (this.f6552d == null) {
            if (aevVar.f6552d != null) {
                return false;
            }
        } else if (!this.f6552d.equals(aevVar.f6552d)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aevVar.f8769X == null || aevVar.f8769X.m10147b() : this.f8769X.equals(aevVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = (this.f6549a == null ? 0 : this.f6549a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
        afa afaVar = this.f6550b;
        int i = iHashCode2 * 31;
        int iHashCode3 = afaVar == null ? 0 : afaVar.hashCode();
        afa afaVar2 = this.f6551c;
        int iHashCode4 = ((this.f6552d == null ? 0 : this.f6552d.hashCode()) + (((afaVar2 == null ? 0 : afaVar2.hashCode()) + ((iHashCode3 + i) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode4 + iHashCode;
    }
}
