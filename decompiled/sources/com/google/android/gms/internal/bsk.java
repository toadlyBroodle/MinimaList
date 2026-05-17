package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsk extends brw<bsk> {

    /* JADX INFO: renamed from: a */
    private byte[] f8853a = null;

    /* JADX INFO: renamed from: b */
    private byte[] f8854b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f8855c = null;

    public bsk() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8853a != null) {
            iMo7775a += bru.m10114b(1, this.f8853a);
        }
        if (this.f8854b != null) {
            iMo7775a += bru.m10114b(2, this.f8854b);
        }
        return this.f8855c != null ? iMo7775a + bru.m10114b(3, this.f8855c) : iMo7775a;
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
                    this.f8853a = brtVar.m10095f();
                    break;
                case 18:
                    this.f8854b = brtVar.m10095f();
                    break;
                case 26:
                    this.f8855c = brtVar.m10095f();
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
        if (this.f8853a != null) {
            bruVar.m10130a(1, this.f8853a);
        }
        if (this.f8854b != null) {
            bruVar.m10130a(2, this.f8854b);
        }
        if (this.f8855c != null) {
            bruVar.m10130a(3, this.f8855c);
        }
        super.mo7777a(bruVar);
    }
}
