package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bwr extends brw<bwr> {

    /* JADX INFO: renamed from: a */
    public Integer f9202a = null;

    /* JADX INFO: renamed from: b */
    public Integer f9203b = null;

    /* JADX INFO: renamed from: c */
    public Integer f9204c = null;

    public bwr() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f9202a != null) {
            iMo7775a += bru.m10111b(1, this.f9202a.intValue());
        }
        if (this.f9203b != null) {
            iMo7775a += bru.m10111b(2, this.f9203b.intValue());
        }
        return this.f9204c != null ? iMo7775a + bru.m10111b(3, this.f9204c.intValue()) : iMo7775a;
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
                    this.f9202a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 16:
                    this.f9203b = Integer.valueOf(brtVar.m10096g());
                    break;
                case 24:
                    this.f9204c = Integer.valueOf(brtVar.m10096g());
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
        if (this.f9202a != null) {
            bruVar.m10125a(1, this.f9202a.intValue());
        }
        if (this.f9203b != null) {
            bruVar.m10125a(2, this.f9203b.intValue());
        }
        if (this.f9204c != null) {
            bruVar.m10125a(3, this.f9204c.intValue());
        }
        super.mo7777a(bruVar);
    }
}
