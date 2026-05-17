package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aey extends brw<aey> {

    /* JADX INFO: renamed from: a */
    public aez[] f6565a = aez.m7788b();

    public aey() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6565a != null && this.f6565a.length > 0) {
            for (int i = 0; i < this.f6565a.length; i++) {
                aez aezVar = this.f6565a[i];
                if (aezVar != null) {
                    iMo7775a += bru.m10112b(1, aezVar);
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
                case 10:
                    int iM10172a = bsf.m10172a(brtVar, 10);
                    int length = this.f6565a == null ? 0 : this.f6565a.length;
                    aez[] aezVarArr = new aez[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6565a, 0, aezVarArr, 0, length);
                    }
                    while (length < aezVarArr.length - 1) {
                        aezVarArr[length] = new aez();
                        brtVar.m10084a(aezVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aezVarArr[length] = new aez();
                    brtVar.m10084a(aezVarArr[length]);
                    this.f6565a = aezVarArr;
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
        if (this.f6565a != null && this.f6565a.length > 0) {
            for (int i = 0; i < this.f6565a.length; i++) {
                aez aezVar = this.f6565a[i];
                if (aezVar != null) {
                    bruVar.m10127a(1, aezVar);
                }
            }
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aey)) {
            return false;
        }
        aey aeyVar = (aey) obj;
        if (bsa.m10157a(this.f6565a, aeyVar.f6565a)) {
            return (this.f8769X == null || this.f8769X.m10147b()) ? aeyVar.f8769X == null || aeyVar.f8769X.m10147b() : this.f8769X.equals(aeyVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8769X == null || this.f8769X.m10147b()) ? 0 : this.f8769X.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + bsa.m10154a(this.f6565a)) * 31);
    }
}
