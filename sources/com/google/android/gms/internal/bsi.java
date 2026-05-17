package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsi extends brw<bsi> {

    /* JADX INFO: renamed from: c */
    private static volatile bsi[] f8845c;

    /* JADX INFO: renamed from: a */
    public byte[] f8846a = null;

    /* JADX INFO: renamed from: b */
    public byte[] f8847b = null;

    public bsi() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static bsi[] m10174b() {
        if (f8845c == null) {
            synchronized (bsa.f8811b) {
                if (f8845c == null) {
                    f8845c = new bsi[0];
                }
            }
        }
        return f8845c;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a() + bru.m10114b(1, this.f8846a);
        return this.f8847b != null ? iMo7775a + bru.m10114b(2, this.f8847b) : iMo7775a;
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
                    this.f8846a = brtVar.m10095f();
                    break;
                case 18:
                    this.f8847b = brtVar.m10095f();
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
        bruVar.m10130a(1, this.f8846a);
        if (this.f8847b != null) {
            bruVar.m10130a(2, this.f8847b);
        }
        super.mo7777a(bruVar);
    }
}
