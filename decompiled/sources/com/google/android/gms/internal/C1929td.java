package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.td */
/* JADX INFO: loaded from: classes.dex */
public final class C1929td extends brw<C1929td> {

    /* JADX INFO: renamed from: a */
    public String f11536a;

    /* JADX INFO: renamed from: b */
    private String f11537b;

    /* JADX INFO: renamed from: c */
    private String f11538c;

    /* JADX INFO: renamed from: d */
    private String f11539d;

    /* JADX INFO: renamed from: e */
    private String f11540e;

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11536a != null) {
            iMo7775a += bru.m10113b(1, this.f11536a);
        }
        if (this.f11537b != null) {
            iMo7775a += bru.m10113b(2, this.f11537b);
        }
        if (this.f11538c != null) {
            iMo7775a += bru.m10113b(3, this.f11538c);
        }
        if (this.f11539d != null) {
            iMo7775a += bru.m10113b(4, this.f11539d);
        }
        return this.f11540e != null ? iMo7775a + bru.m10113b(5, this.f11540e) : iMo7775a;
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
                    this.f11536a = brtVar.m10093e();
                    break;
                case 18:
                    this.f11537b = brtVar.m10093e();
                    break;
                case 26:
                    this.f11538c = brtVar.m10093e();
                    break;
                case 34:
                    this.f11539d = brtVar.m10093e();
                    break;
                case 42:
                    this.f11540e = brtVar.m10093e();
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
        if (this.f11536a != null) {
            bruVar.m10128a(1, this.f11536a);
        }
        if (this.f11537b != null) {
            bruVar.m10128a(2, this.f11537b);
        }
        if (this.f11538c != null) {
            bruVar.m10128a(3, this.f11538c);
        }
        if (this.f11539d != null) {
            bruVar.m10128a(4, this.f11539d);
        }
        if (this.f11540e != null) {
            bruVar.m10128a(5, this.f11540e);
        }
        super.mo7777a(bruVar);
    }
}
