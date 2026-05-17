package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aem extends brw<aem> {

    /* JADX INFO: renamed from: e */
    private static volatile aem[] f6509e;

    /* JADX INFO: renamed from: a */
    public Integer f6510a = null;

    /* JADX INFO: renamed from: b */
    public String f6511b = null;

    /* JADX INFO: renamed from: c */
    public aen[] f6512c = aen.m7779b();

    /* JADX INFO: renamed from: f */
    private Boolean f6514f = null;

    /* JADX INFO: renamed from: d */
    public aeo f6513d = null;

    public aem() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aem[] m7778b() {
        if (f6509e == null) {
            synchronized (bsa.f8811b) {
                if (f6509e == null) {
                    f6509e = new aem[0];
                }
            }
        }
        return f6509e;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6510a != null) {
            iMo7775a += bru.m10111b(1, this.f6510a.intValue());
        }
        if (this.f6511b != null) {
            iMo7775a += bru.m10113b(2, this.f6511b);
        }
        if (this.f6512c != null && this.f6512c.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f6512c.length; i++) {
                aen aenVar = this.f6512c[i];
                if (aenVar != null) {
                    iM10112b += bru.m10112b(3, aenVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f6514f != null) {
            this.f6514f.booleanValue();
            iMo7775a += bru.m10110b(4) + 1;
        }
        return this.f6513d != null ? iMo7775a + bru.m10112b(5, this.f6513d) : iMo7775a;
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
                    this.f6510a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 18:
                    this.f6511b = brtVar.m10093e();
                    break;
                case 26:
                    int iM10172a = bsf.m10172a(brtVar, 26);
                    int length = this.f6512c == null ? 0 : this.f6512c.length;
                    aen[] aenVarArr = new aen[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6512c, 0, aenVarArr, 0, length);
                    }
                    while (length < aenVarArr.length - 1) {
                        aenVarArr[length] = new aen();
                        brtVar.m10084a(aenVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aenVarArr[length] = new aen();
                    brtVar.m10084a(aenVarArr[length]);
                    this.f6512c = aenVarArr;
                    break;
                case 32:
                    this.f6514f = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 42:
                    if (this.f6513d == null) {
                        this.f6513d = new aeo();
                    }
                    brtVar.m10084a(this.f6513d);
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
        if (this.f6510a != null) {
            bruVar.m10125a(1, this.f6510a.intValue());
        }
        if (this.f6511b != null) {
            bruVar.m10128a(2, this.f6511b);
        }
        if (this.f6512c != null && this.f6512c.length > 0) {
            for (int i = 0; i < this.f6512c.length; i++) {
                aen aenVar = this.f6512c[i];
                if (aenVar != null) {
                    bruVar.m10127a(3, aenVar);
                }
            }
        }
        if (this.f6514f != null) {
            bruVar.m10129a(4, this.f6514f.booleanValue());
        }
        if (this.f6513d != null) {
            bruVar.m10127a(5, this.f6513d);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aem)) {
            return false;
        }
        aem aemVar = (aem) obj;
        if (this.f6510a == null) {
            if (aemVar.f6510a != null) {
                return false;
            }
        } else if (!this.f6510a.equals(aemVar.f6510a)) {
            return false;
        }
        if (this.f6511b == null) {
            if (aemVar.f6511b != null) {
                return false;
            }
        } else if (!this.f6511b.equals(aemVar.f6511b)) {
            return false;
        }
        if (!bsa.m10157a(this.f6512c, aemVar.f6512c)) {
            return false;
        }
        if (this.f6514f == null) {
            if (aemVar.f6514f != null) {
                return false;
            }
        } else if (!this.f6514f.equals(aemVar.f6514f)) {
            return false;
        }
        if (this.f6513d == null) {
            if (aemVar.f6513d != null) {
                return false;
            }
        } else if (!this.f6513d.equals(aemVar.f6513d)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aemVar.f8769X == null || aemVar.f8769X.m10147b() : this.f8769X.equals(aemVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = (this.f6514f == null ? 0 : this.f6514f.hashCode()) + (((((this.f6511b == null ? 0 : this.f6511b.hashCode()) + (((this.f6510a == null ? 0 : this.f6510a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + bsa.m10154a(this.f6512c)) * 31);
        aeo aeoVar = this.f6513d;
        int iHashCode3 = ((aeoVar == null ? 0 : aeoVar.hashCode()) + (iHashCode2 * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode3 + iHashCode;
    }
}
