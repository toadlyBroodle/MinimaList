package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aew extends brw<aew> {

    /* JADX INFO: renamed from: f */
    private static volatile aew[] f6553f;

    /* JADX INFO: renamed from: a */
    public aex[] f6554a = aex.m7787b();

    /* JADX INFO: renamed from: b */
    public String f6555b = null;

    /* JADX INFO: renamed from: c */
    public Long f6556c = null;

    /* JADX INFO: renamed from: d */
    public Long f6557d = null;

    /* JADX INFO: renamed from: e */
    public Integer f6558e = null;

    public aew() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aew[] m7786b() {
        if (f6553f == null) {
            synchronized (bsa.f8811b) {
                if (f6553f == null) {
                    f6553f = new aew[0];
                }
            }
        }
        return f6553f;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6554a != null && this.f6554a.length > 0) {
            for (int i = 0; i < this.f6554a.length; i++) {
                aex aexVar = this.f6554a[i];
                if (aexVar != null) {
                    iMo7775a += bru.m10112b(1, aexVar);
                }
            }
        }
        if (this.f6555b != null) {
            iMo7775a += bru.m10113b(2, this.f6555b);
        }
        if (this.f6556c != null) {
            iMo7775a += bru.m10118c(3, this.f6556c.longValue());
        }
        if (this.f6557d != null) {
            iMo7775a += bru.m10118c(4, this.f6557d.longValue());
        }
        return this.f6558e != null ? iMo7775a + bru.m10111b(5, this.f6558e.intValue()) : iMo7775a;
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
                    int iM10172a = bsf.m10172a(brtVar, 10);
                    int length = this.f6554a == null ? 0 : this.f6554a.length;
                    aex[] aexVarArr = new aex[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6554a, 0, aexVarArr, 0, length);
                    }
                    while (length < aexVarArr.length - 1) {
                        aexVarArr[length] = new aex();
                        brtVar.m10084a(aexVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aexVarArr[length] = new aex();
                    brtVar.m10084a(aexVarArr[length]);
                    this.f6554a = aexVarArr;
                    break;
                case 18:
                    this.f6555b = brtVar.m10093e();
                    break;
                case 24:
                    this.f6556c = Long.valueOf(brtVar.m10097h());
                    break;
                case 32:
                    this.f6557d = Long.valueOf(brtVar.m10097h());
                    break;
                case 40:
                    this.f6558e = Integer.valueOf(brtVar.m10096g());
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
        if (this.f6554a != null && this.f6554a.length > 0) {
            for (int i = 0; i < this.f6554a.length; i++) {
                aex aexVar = this.f6554a[i];
                if (aexVar != null) {
                    bruVar.m10127a(1, aexVar);
                }
            }
        }
        if (this.f6555b != null) {
            bruVar.m10128a(2, this.f6555b);
        }
        if (this.f6556c != null) {
            bruVar.m10132b(3, this.f6556c.longValue());
        }
        if (this.f6557d != null) {
            bruVar.m10132b(4, this.f6557d.longValue());
        }
        if (this.f6558e != null) {
            bruVar.m10125a(5, this.f6558e.intValue());
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aew)) {
            return false;
        }
        aew aewVar = (aew) obj;
        if (!bsa.m10157a(this.f6554a, aewVar.f6554a)) {
            return false;
        }
        if (this.f6555b == null) {
            if (aewVar.f6555b != null) {
                return false;
            }
        } else if (!this.f6555b.equals(aewVar.f6555b)) {
            return false;
        }
        if (this.f6556c == null) {
            if (aewVar.f6556c != null) {
                return false;
            }
        } else if (!this.f6556c.equals(aewVar.f6556c)) {
            return false;
        }
        if (this.f6557d == null) {
            if (aewVar.f6557d != null) {
                return false;
            }
        } else if (!this.f6557d.equals(aewVar.f6557d)) {
            return false;
        }
        if (this.f6558e == null) {
            if (aewVar.f6558e != null) {
                return false;
            }
        } else if (!this.f6558e.equals(aewVar.f6558e)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aewVar.f8769X == null || aewVar.f8769X.m10147b() : this.f8769X.equals(aewVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6558e == null ? 0 : this.f6558e.hashCode()) + (((this.f6557d == null ? 0 : this.f6557d.hashCode()) + (((this.f6556c == null ? 0 : this.f6556c.hashCode()) + (((this.f6555b == null ? 0 : this.f6555b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + bsa.m10154a(this.f6554a)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
