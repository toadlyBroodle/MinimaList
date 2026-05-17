package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class afa extends brw<afa> {

    /* JADX INFO: renamed from: a */
    public long[] f6602a = bsf.f8817b;

    /* JADX INFO: renamed from: b */
    public long[] f6603b = bsf.f8817b;

    public afa() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int length;
        int iMo7775a = super.mo7775a();
        if (this.f6602a == null || this.f6602a.length <= 0) {
            length = iMo7775a;
        } else {
            int iM10103a = 0;
            for (int i = 0; i < this.f6602a.length; i++) {
                iM10103a += bru.m10103a(this.f6602a[i]);
            }
            length = iMo7775a + iM10103a + (this.f6602a.length * 1);
        }
        if (this.f6603b == null || this.f6603b.length <= 0) {
            return length;
        }
        int iM10103a2 = 0;
        for (int i2 = 0; i2 < this.f6603b.length; i2++) {
            iM10103a2 += bru.m10103a(this.f6603b[i2]);
        }
        return length + iM10103a2 + (this.f6603b.length * 1);
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
                    int iM10172a = bsf.m10172a(brtVar, 8);
                    int length = this.f6602a == null ? 0 : this.f6602a.length;
                    long[] jArr = new long[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6602a, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = brtVar.m10097h();
                        brtVar.m10082a();
                        length++;
                    }
                    jArr[length] = brtVar.m10097h();
                    this.f6602a = jArr;
                    break;
                case 10:
                    int iM10090c = brtVar.m10090c(brtVar.m10096g());
                    int iM10101l = brtVar.m10101l();
                    int i = 0;
                    while (brtVar.m10100k() > 0) {
                        brtVar.m10097h();
                        i++;
                    }
                    brtVar.m10094e(iM10101l);
                    int length2 = this.f6602a == null ? 0 : this.f6602a.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f6602a, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = brtVar.m10097h();
                        length2++;
                    }
                    this.f6602a = jArr2;
                    brtVar.m10091d(iM10090c);
                    break;
                case 16:
                    int iM10172a2 = bsf.m10172a(brtVar, 16);
                    int length3 = this.f6603b == null ? 0 : this.f6603b.length;
                    long[] jArr3 = new long[iM10172a2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f6603b, 0, jArr3, 0, length3);
                    }
                    while (length3 < jArr3.length - 1) {
                        jArr3[length3] = brtVar.m10097h();
                        brtVar.m10082a();
                        length3++;
                    }
                    jArr3[length3] = brtVar.m10097h();
                    this.f6603b = jArr3;
                    break;
                case 18:
                    int iM10090c2 = brtVar.m10090c(brtVar.m10096g());
                    int iM10101l2 = brtVar.m10101l();
                    int i2 = 0;
                    while (brtVar.m10100k() > 0) {
                        brtVar.m10097h();
                        i2++;
                    }
                    brtVar.m10094e(iM10101l2);
                    int length4 = this.f6603b == null ? 0 : this.f6603b.length;
                    long[] jArr4 = new long[i2 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.f6603b, 0, jArr4, 0, length4);
                    }
                    while (length4 < jArr4.length) {
                        jArr4[length4] = brtVar.m10097h();
                        length4++;
                    }
                    this.f6603b = jArr4;
                    brtVar.m10091d(iM10090c2);
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
        if (this.f6602a != null && this.f6602a.length > 0) {
            for (int i = 0; i < this.f6602a.length; i++) {
                bruVar.m10126a(1, this.f6602a[i]);
            }
        }
        if (this.f6603b != null && this.f6603b.length > 0) {
            for (int i2 = 0; i2 < this.f6603b.length; i2++) {
                bruVar.m10126a(2, this.f6603b[i2]);
            }
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afa)) {
            return false;
        }
        afa afaVar = (afa) obj;
        if (bsa.m10156a(this.f6602a, afaVar.f6602a) && bsa.m10156a(this.f6603b, afaVar.f6603b)) {
            return (this.f8769X == null || this.f8769X.m10147b()) ? afaVar.f8769X == null || afaVar.f8769X.m10147b() : this.f8769X.equals(afaVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8769X == null || this.f8769X.m10147b()) ? 0 : this.f8769X.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + bsa.m10153a(this.f6602a)) * 31) + bsa.m10153a(this.f6603b)) * 31);
    }
}
