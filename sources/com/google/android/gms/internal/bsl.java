package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsl extends brw<bsl> {

    /* JADX INFO: renamed from: a */
    private bsm f8856a = null;

    /* JADX INFO: renamed from: b */
    private bsi[] f8857b = bsi.m10174b();

    /* JADX INFO: renamed from: c */
    private byte[] f8858c = null;

    /* JADX INFO: renamed from: d */
    private byte[] f8859d = null;

    /* JADX INFO: renamed from: e */
    private Integer f8860e = null;

    /* JADX INFO: renamed from: f */
    private byte[] f8861f = null;

    public bsl() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8856a != null) {
            iMo7775a += bru.m10112b(1, this.f8856a);
        }
        if (this.f8857b != null && this.f8857b.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f8857b.length; i++) {
                bsi bsiVar = this.f8857b[i];
                if (bsiVar != null) {
                    iM10112b += bru.m10112b(2, bsiVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f8858c != null) {
            iMo7775a += bru.m10114b(3, this.f8858c);
        }
        if (this.f8859d != null) {
            iMo7775a += bru.m10114b(4, this.f8859d);
        }
        if (this.f8860e != null) {
            iMo7775a += bru.m10111b(5, this.f8860e.intValue());
        }
        return this.f8861f != null ? iMo7775a + bru.m10114b(6, this.f8861f) : iMo7775a;
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
                    if (this.f8856a == null) {
                        this.f8856a = new bsm();
                    }
                    brtVar.m10084a(this.f8856a);
                    break;
                case 18:
                    int iM10172a = bsf.m10172a(brtVar, 18);
                    int length = this.f8857b == null ? 0 : this.f8857b.length;
                    bsi[] bsiVarArr = new bsi[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f8857b, 0, bsiVarArr, 0, length);
                    }
                    while (length < bsiVarArr.length - 1) {
                        bsiVarArr[length] = new bsi();
                        brtVar.m10084a(bsiVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    bsiVarArr[length] = new bsi();
                    brtVar.m10084a(bsiVarArr[length]);
                    this.f8857b = bsiVarArr;
                    break;
                case 26:
                    this.f8858c = brtVar.m10095f();
                    break;
                case 34:
                    this.f8859d = brtVar.m10095f();
                    break;
                case 40:
                    this.f8860e = Integer.valueOf(brtVar.m10089c());
                    break;
                case 50:
                    this.f8861f = brtVar.m10095f();
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
        if (this.f8856a != null) {
            bruVar.m10127a(1, this.f8856a);
        }
        if (this.f8857b != null && this.f8857b.length > 0) {
            for (int i = 0; i < this.f8857b.length; i++) {
                bsi bsiVar = this.f8857b[i];
                if (bsiVar != null) {
                    bruVar.m10127a(2, bsiVar);
                }
            }
        }
        if (this.f8858c != null) {
            bruVar.m10130a(3, this.f8858c);
        }
        if (this.f8859d != null) {
            bruVar.m10130a(4, this.f8859d);
        }
        if (this.f8860e != null) {
            bruVar.m10125a(5, this.f8860e.intValue());
        }
        if (this.f8861f != null) {
            bruVar.m10130a(6, this.f8861f);
        }
        super.mo7777a(bruVar);
    }
}
