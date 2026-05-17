package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsq extends brw<bsq> {

    /* JADX INFO: renamed from: b */
    private static volatile bsq[] f8881b;

    /* JADX INFO: renamed from: a */
    public String f8882a = "";

    public bsq() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static bsq[] m10178b() {
        if (f8881b == null) {
            synchronized (bsa.f8811b) {
                if (f8881b == null) {
                    f8881b = new bsq[0];
                }
            }
        }
        return f8881b;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        return (this.f8882a == null || this.f8882a.equals("")) ? iMo7775a : iMo7775a + bru.m10113b(1, this.f8882a);
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
                    this.f8882a = brtVar.m10093e();
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
        if (this.f8882a != null && !this.f8882a.equals("")) {
            bruVar.m10128a(1, this.f8882a);
        }
        super.mo7777a(bruVar);
    }
}
