package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.vv */
/* JADX INFO: loaded from: classes.dex */
public final class C2001vv extends brw<C2001vv> {

    /* JADX INFO: renamed from: a */
    public Long f11833a = null;

    /* JADX INFO: renamed from: b */
    private String f11834b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f11835c = null;

    public C2001vv() {
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11833a != null) {
            iMo7775a += bru.m10118c(1, this.f11833a.longValue());
        }
        if (this.f11834b != null) {
            iMo7775a += bru.m10113b(3, this.f11834b);
        }
        return this.f11835c != null ? iMo7775a + bru.m10114b(4, this.f11835c) : iMo7775a;
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
                    this.f11833a = Long.valueOf(brtVar.m10097h());
                    break;
                case 26:
                    this.f11834b = brtVar.m10093e();
                    break;
                case 34:
                    this.f11835c = brtVar.m10095f();
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
        if (this.f11833a != null) {
            bruVar.m10132b(1, this.f11833a.longValue());
        }
        if (this.f11834b != null) {
            bruVar.m10128a(3, this.f11834b);
        }
        if (this.f11835c != null) {
            bruVar.m10130a(4, this.f11835c);
        }
        super.mo7777a(bruVar);
    }
}
