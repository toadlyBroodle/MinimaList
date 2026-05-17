package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsm extends brw<bsm> {

    /* JADX INFO: renamed from: a */
    private Integer f8862a = null;

    /* JADX INFO: renamed from: b */
    private byte[] f8863b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f8864c = null;

    public bsm() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8862a != null) {
            iMo7775a += bru.m10111b(1, this.f8862a.intValue());
        }
        if (this.f8863b != null) {
            iMo7775a += bru.m10114b(2, this.f8863b);
        }
        return this.f8864c != null ? iMo7775a + bru.m10114b(3, this.f8864c) : iMo7775a;
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
                    this.f8862a = Integer.valueOf(brtVar.m10089c());
                    break;
                case 18:
                    this.f8863b = brtVar.m10095f();
                    break;
                case 26:
                    this.f8864c = brtVar.m10095f();
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
        if (this.f8862a != null) {
            bruVar.m10125a(1, this.f8862a.intValue());
        }
        if (this.f8863b != null) {
            bruVar.m10130a(2, this.f8863b);
        }
        if (this.f8864c != null) {
            bruVar.m10130a(3, this.f8864c);
        }
        super.mo7777a(bruVar);
    }
}
