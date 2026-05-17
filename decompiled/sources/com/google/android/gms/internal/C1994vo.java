package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.vo */
/* JADX INFO: loaded from: classes.dex */
public final class C1994vo extends brw<C1994vo> {

    /* JADX INFO: renamed from: a */
    public byte[] f11819a = null;

    /* JADX INFO: renamed from: b */
    public byte[] f11820b = null;

    /* JADX INFO: renamed from: c */
    public byte[] f11821c = null;

    /* JADX INFO: renamed from: d */
    public byte[] f11822d = null;

    public C1994vo() {
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11819a != null) {
            iMo7775a += bru.m10114b(1, this.f11819a);
        }
        if (this.f11820b != null) {
            iMo7775a += bru.m10114b(2, this.f11820b);
        }
        if (this.f11821c != null) {
            iMo7775a += bru.m10114b(3, this.f11821c);
        }
        return this.f11822d != null ? iMo7775a + bru.m10114b(4, this.f11822d) : iMo7775a;
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
                    this.f11819a = brtVar.m10095f();
                    break;
                case 18:
                    this.f11820b = brtVar.m10095f();
                    break;
                case 26:
                    this.f11821c = brtVar.m10095f();
                    break;
                case 34:
                    this.f11822d = brtVar.m10095f();
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
        if (this.f11819a != null) {
            bruVar.m10130a(1, this.f11819a);
        }
        if (this.f11820b != null) {
            bruVar.m10130a(2, this.f11820b);
        }
        if (this.f11821c != null) {
            bruVar.m10130a(3, this.f11821c);
        }
        if (this.f11822d != null) {
            bruVar.m10130a(4, this.f11822d);
        }
        super.mo7777a(bruVar);
    }
}
