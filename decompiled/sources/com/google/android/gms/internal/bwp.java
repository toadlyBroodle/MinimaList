package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bwp extends brw<bwp> {

    /* JADX INFO: renamed from: a */
    public String f9196a = null;

    /* JADX INFO: renamed from: b */
    public bwr f9197b = null;

    public bwp() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f9196a != null) {
            iMo7775a += bru.m10113b(1, this.f9196a);
        }
        return this.f9197b != null ? iMo7775a + bru.m10112b(4, this.f9197b) : iMo7775a;
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
                    this.f9196a = brtVar.m10093e();
                    break;
                case 34:
                    if (this.f9197b == null) {
                        this.f9197b = new bwr();
                    }
                    brtVar.m10084a(this.f9197b);
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
        if (this.f9196a != null) {
            bruVar.m10128a(1, this.f9196a);
        }
        if (this.f9197b != null) {
            bruVar.m10127a(4, this.f9197b);
        }
        super.mo7777a(bruVar);
    }
}
