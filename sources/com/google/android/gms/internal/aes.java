package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aes extends brw<aes> {

    /* JADX INFO: renamed from: a */
    public Long f6538a = null;

    /* JADX INFO: renamed from: b */
    public String f6539b = null;

    /* JADX INFO: renamed from: f */
    private Integer f6543f = null;

    /* JADX INFO: renamed from: c */
    public aet[] f6540c = aet.m7784b();

    /* JADX INFO: renamed from: d */
    public aer[] f6541d = aer.m7783b();

    /* JADX INFO: renamed from: e */
    public ael[] f6542e = ael.m7774b();

    public aes() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6538a != null) {
            iMo7775a += bru.m10118c(1, this.f6538a.longValue());
        }
        if (this.f6539b != null) {
            iMo7775a += bru.m10113b(2, this.f6539b);
        }
        if (this.f6543f != null) {
            iMo7775a += bru.m10111b(3, this.f6543f.intValue());
        }
        if (this.f6540c != null && this.f6540c.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f6540c.length; i++) {
                aet aetVar = this.f6540c[i];
                if (aetVar != null) {
                    iM10112b += bru.m10112b(4, aetVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f6541d != null && this.f6541d.length > 0) {
            int iM10112b2 = iMo7775a;
            for (int i2 = 0; i2 < this.f6541d.length; i2++) {
                aer aerVar = this.f6541d[i2];
                if (aerVar != null) {
                    iM10112b2 += bru.m10112b(5, aerVar);
                }
            }
            iMo7775a = iM10112b2;
        }
        if (this.f6542e != null && this.f6542e.length > 0) {
            for (int i3 = 0; i3 < this.f6542e.length; i3++) {
                ael aelVar = this.f6542e[i3];
                if (aelVar != null) {
                    iMo7775a += bru.m10112b(6, aelVar);
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
                    this.f6538a = Long.valueOf(brtVar.m10097h());
                    break;
                case 18:
                    this.f6539b = brtVar.m10093e();
                    break;
                case 24:
                    this.f6543f = Integer.valueOf(brtVar.m10096g());
                    break;
                case 34:
                    int iM10172a = bsf.m10172a(brtVar, 34);
                    int length = this.f6540c == null ? 0 : this.f6540c.length;
                    aet[] aetVarArr = new aet[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6540c, 0, aetVarArr, 0, length);
                    }
                    while (length < aetVarArr.length - 1) {
                        aetVarArr[length] = new aet();
                        brtVar.m10084a(aetVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aetVarArr[length] = new aet();
                    brtVar.m10084a(aetVarArr[length]);
                    this.f6540c = aetVarArr;
                    break;
                case 42:
                    int iM10172a2 = bsf.m10172a(brtVar, 42);
                    int length2 = this.f6541d == null ? 0 : this.f6541d.length;
                    aer[] aerVarArr = new aer[iM10172a2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f6541d, 0, aerVarArr, 0, length2);
                    }
                    while (length2 < aerVarArr.length - 1) {
                        aerVarArr[length2] = new aer();
                        brtVar.m10084a(aerVarArr[length2]);
                        brtVar.m10082a();
                        length2++;
                    }
                    aerVarArr[length2] = new aer();
                    brtVar.m10084a(aerVarArr[length2]);
                    this.f6541d = aerVarArr;
                    break;
                case 50:
                    int iM10172a3 = bsf.m10172a(brtVar, 50);
                    int length3 = this.f6542e == null ? 0 : this.f6542e.length;
                    ael[] aelVarArr = new ael[iM10172a3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f6542e, 0, aelVarArr, 0, length3);
                    }
                    while (length3 < aelVarArr.length - 1) {
                        aelVarArr[length3] = new ael();
                        brtVar.m10084a(aelVarArr[length3]);
                        brtVar.m10082a();
                        length3++;
                    }
                    aelVarArr[length3] = new ael();
                    brtVar.m10084a(aelVarArr[length3]);
                    this.f6542e = aelVarArr;
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
        if (this.f6538a != null) {
            bruVar.m10132b(1, this.f6538a.longValue());
        }
        if (this.f6539b != null) {
            bruVar.m10128a(2, this.f6539b);
        }
        if (this.f6543f != null) {
            bruVar.m10125a(3, this.f6543f.intValue());
        }
        if (this.f6540c != null && this.f6540c.length > 0) {
            for (int i = 0; i < this.f6540c.length; i++) {
                aet aetVar = this.f6540c[i];
                if (aetVar != null) {
                    bruVar.m10127a(4, aetVar);
                }
            }
        }
        if (this.f6541d != null && this.f6541d.length > 0) {
            for (int i2 = 0; i2 < this.f6541d.length; i2++) {
                aer aerVar = this.f6541d[i2];
                if (aerVar != null) {
                    bruVar.m10127a(5, aerVar);
                }
            }
        }
        if (this.f6542e != null && this.f6542e.length > 0) {
            for (int i3 = 0; i3 < this.f6542e.length; i3++) {
                ael aelVar = this.f6542e[i3];
                if (aelVar != null) {
                    bruVar.m10127a(6, aelVar);
                }
            }
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aes)) {
            return false;
        }
        aes aesVar = (aes) obj;
        if (this.f6538a == null) {
            if (aesVar.f6538a != null) {
                return false;
            }
        } else if (!this.f6538a.equals(aesVar.f6538a)) {
            return false;
        }
        if (this.f6539b == null) {
            if (aesVar.f6539b != null) {
                return false;
            }
        } else if (!this.f6539b.equals(aesVar.f6539b)) {
            return false;
        }
        if (this.f6543f == null) {
            if (aesVar.f6543f != null) {
                return false;
            }
        } else if (!this.f6543f.equals(aesVar.f6543f)) {
            return false;
        }
        if (bsa.m10157a(this.f6540c, aesVar.f6540c) && bsa.m10157a(this.f6541d, aesVar.f6541d) && bsa.m10157a(this.f6542e, aesVar.f6542e)) {
            return (this.f8769X == null || this.f8769X.m10147b()) ? aesVar.f8769X == null || aesVar.f8769X.m10147b() : this.f8769X.equals(aesVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((((((((this.f6543f == null ? 0 : this.f6543f.hashCode()) + (((this.f6539b == null ? 0 : this.f6539b.hashCode()) + (((this.f6538a == null ? 0 : this.f6538a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31) + bsa.m10154a(this.f6540c)) * 31) + bsa.m10154a(this.f6541d)) * 31) + bsa.m10154a(this.f6542e)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
