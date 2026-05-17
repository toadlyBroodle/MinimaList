package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsj extends brw<bsj> {

    /* JADX INFO: renamed from: b */
    private bsk f8849b = null;

    /* JADX INFO: renamed from: a */
    public bsi[] f8848a = bsi.m10174b();

    /* JADX INFO: renamed from: c */
    private byte[] f8850c = null;

    /* JADX INFO: renamed from: d */
    private byte[] f8851d = null;

    /* JADX INFO: renamed from: e */
    private Integer f8852e = null;

    public bsj() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8849b != null) {
            iMo7775a += bru.m10112b(1, this.f8849b);
        }
        if (this.f8848a != null && this.f8848a.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f8848a.length; i++) {
                bsi bsiVar = this.f8848a[i];
                if (bsiVar != null) {
                    iM10112b += bru.m10112b(2, bsiVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f8850c != null) {
            iMo7775a += bru.m10114b(3, this.f8850c);
        }
        if (this.f8851d != null) {
            iMo7775a += bru.m10114b(4, this.f8851d);
        }
        return this.f8852e != null ? iMo7775a + bru.m10111b(5, this.f8852e.intValue()) : iMo7775a;
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
                    if (this.f8849b == null) {
                        this.f8849b = new bsk();
                    }
                    brtVar.m10084a(this.f8849b);
                    break;
                case 18:
                    int iM10172a = bsf.m10172a(brtVar, 18);
                    int length = this.f8848a == null ? 0 : this.f8848a.length;
                    bsi[] bsiVarArr = new bsi[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f8848a, 0, bsiVarArr, 0, length);
                    }
                    while (length < bsiVarArr.length - 1) {
                        bsiVarArr[length] = new bsi();
                        brtVar.m10084a(bsiVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    bsiVarArr[length] = new bsi();
                    brtVar.m10084a(bsiVarArr[length]);
                    this.f8848a = bsiVarArr;
                    break;
                case 26:
                    this.f8850c = brtVar.m10095f();
                    break;
                case 34:
                    this.f8851d = brtVar.m10095f();
                    break;
                case 40:
                    this.f8852e = Integer.valueOf(brtVar.m10089c());
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
        if (this.f8849b != null) {
            bruVar.m10127a(1, this.f8849b);
        }
        if (this.f8848a != null && this.f8848a.length > 0) {
            for (int i = 0; i < this.f8848a.length; i++) {
                bsi bsiVar = this.f8848a[i];
                if (bsiVar != null) {
                    bruVar.m10127a(2, bsiVar);
                }
            }
        }
        if (this.f8850c != null) {
            bruVar.m10130a(3, this.f8850c);
        }
        if (this.f8851d != null) {
            bruVar.m10130a(4, this.f8851d);
        }
        if (this.f8852e != null) {
            bruVar.m10125a(5, this.f8852e.intValue());
        }
        super.mo7777a(bruVar);
    }
}
