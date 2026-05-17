package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ael extends brw<ael> {

    /* JADX INFO: renamed from: d */
    private static volatile ael[] f6505d;

    /* JADX INFO: renamed from: a */
    public Integer f6506a = null;

    /* JADX INFO: renamed from: b */
    public aep[] f6507b = aep.m7781b();

    /* JADX INFO: renamed from: c */
    public aem[] f6508c = aem.m7778b();

    public ael() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static ael[] m7774b() {
        if (f6505d == null) {
            synchronized (bsa.f8811b) {
                if (f6505d == null) {
                    f6505d = new ael[0];
                }
            }
        }
        return f6505d;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6506a != null) {
            iMo7775a += bru.m10111b(1, this.f6506a.intValue());
        }
        if (this.f6507b != null && this.f6507b.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f6507b.length; i++) {
                aep aepVar = this.f6507b[i];
                if (aepVar != null) {
                    iM10112b += bru.m10112b(2, aepVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f6508c != null && this.f6508c.length > 0) {
            for (int i2 = 0; i2 < this.f6508c.length; i2++) {
                aem aemVar = this.f6508c[i2];
                if (aemVar != null) {
                    iMo7775a += bru.m10112b(3, aemVar);
                }
            }
        }
        return iMo7775a;
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
                    this.f6506a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 18:
                    int iM10172a = bsf.m10172a(brtVar, 18);
                    int length = this.f6507b == null ? 0 : this.f6507b.length;
                    aep[] aepVarArr = new aep[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6507b, 0, aepVarArr, 0, length);
                    }
                    while (length < aepVarArr.length - 1) {
                        aepVarArr[length] = new aep();
                        brtVar.m10084a(aepVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aepVarArr[length] = new aep();
                    brtVar.m10084a(aepVarArr[length]);
                    this.f6507b = aepVarArr;
                    break;
                case 26:
                    int iM10172a2 = bsf.m10172a(brtVar, 26);
                    int length2 = this.f6508c == null ? 0 : this.f6508c.length;
                    aem[] aemVarArr = new aem[iM10172a2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f6508c, 0, aemVarArr, 0, length2);
                    }
                    while (length2 < aemVarArr.length - 1) {
                        aemVarArr[length2] = new aem();
                        brtVar.m10084a(aemVarArr[length2]);
                        brtVar.m10082a();
                        length2++;
                    }
                    aemVarArr[length2] = new aem();
                    brtVar.m10084a(aemVarArr[length2]);
                    this.f6508c = aemVarArr;
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
        if (this.f6506a != null) {
            bruVar.m10125a(1, this.f6506a.intValue());
        }
        if (this.f6507b != null && this.f6507b.length > 0) {
            for (int i = 0; i < this.f6507b.length; i++) {
                aep aepVar = this.f6507b[i];
                if (aepVar != null) {
                    bruVar.m10127a(2, aepVar);
                }
            }
        }
        if (this.f6508c != null && this.f6508c.length > 0) {
            for (int i2 = 0; i2 < this.f6508c.length; i2++) {
                aem aemVar = this.f6508c[i2];
                if (aemVar != null) {
                    bruVar.m10127a(3, aemVar);
                }
            }
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ael)) {
            return false;
        }
        ael aelVar = (ael) obj;
        if (this.f6506a == null) {
            if (aelVar.f6506a != null) {
                return false;
            }
        } else if (!this.f6506a.equals(aelVar.f6506a)) {
            return false;
        }
        if (bsa.m10157a(this.f6507b, aelVar.f6507b) && bsa.m10157a(this.f6508c, aelVar.f6508c)) {
            return (this.f8769X == null || this.f8769X.m10147b()) ? aelVar.f8769X == null || aelVar.f8769X.m10147b() : this.f8769X.equals(aelVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((((((this.f6506a == null ? 0 : this.f6506a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + bsa.m10154a(this.f6507b)) * 31) + bsa.m10154a(this.f6508c)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
