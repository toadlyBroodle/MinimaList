package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsp extends brw<bsp> {

    /* JADX INFO: renamed from: a */
    public String f8878a = null;

    /* JADX INFO: renamed from: b */
    public Long f8879b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f8880c = null;

    public bsp() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8878a != null) {
            iMo7775a += bru.m10113b(1, this.f8878a);
        }
        if (this.f8879b != null) {
            iMo7775a += bru.m10118c(2, this.f8879b.longValue());
        }
        if (this.f8880c == null) {
            return iMo7775a;
        }
        this.f8880c.booleanValue();
        return iMo7775a + bru.m10110b(3) + 1;
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
                    this.f8878a = brtVar.m10093e();
                    break;
                case 16:
                    this.f8879b = Long.valueOf(brtVar.m10086b());
                    break;
                case 24:
                    this.f8880c = Boolean.valueOf(brtVar.m10092d());
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
        if (this.f8878a != null) {
            bruVar.m10128a(1, this.f8878a);
        }
        if (this.f8879b != null) {
            bruVar.m10132b(2, this.f8879b.longValue());
        }
        if (this.f8880c != null) {
            bruVar.m10129a(3, this.f8880c.booleanValue());
        }
        super.mo7777a(bruVar);
    }
}
