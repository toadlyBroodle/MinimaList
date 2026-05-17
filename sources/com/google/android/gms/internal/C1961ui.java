package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ui */
/* JADX INFO: loaded from: classes.dex */
public final class C1961ui extends brw<C1961ui> {

    /* JADX INFO: renamed from: d */
    private Long f11665d = null;

    /* JADX INFO: renamed from: e */
    private Long f11666e = null;

    /* JADX INFO: renamed from: a */
    public Long f11662a = null;

    /* JADX INFO: renamed from: b */
    public Long f11663b = null;

    /* JADX INFO: renamed from: c */
    public Long f11664c = null;

    public C1961ui() {
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11665d != null) {
            iMo7775a += bru.m10118c(1, this.f11665d.longValue());
        }
        if (this.f11666e != null) {
            iMo7775a += bru.m10118c(2, this.f11666e.longValue());
        }
        if (this.f11662a != null) {
            iMo7775a += bru.m10118c(3, this.f11662a.longValue());
        }
        if (this.f11663b != null) {
            iMo7775a += bru.m10118c(4, this.f11663b.longValue());
        }
        return this.f11664c != null ? iMo7775a + bru.m10118c(5, this.f11664c.longValue()) : iMo7775a;
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
                    this.f11665d = Long.valueOf(brtVar.m10097h());
                    break;
                case 16:
                    this.f11666e = Long.valueOf(brtVar.m10097h());
                    break;
                case 24:
                    this.f11662a = Long.valueOf(brtVar.m10097h());
                    break;
                case 32:
                    this.f11663b = Long.valueOf(brtVar.m10097h());
                    break;
                case 40:
                    this.f11664c = Long.valueOf(brtVar.m10097h());
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
        if (this.f11665d != null) {
            bruVar.m10132b(1, this.f11665d.longValue());
        }
        if (this.f11666e != null) {
            bruVar.m10132b(2, this.f11666e.longValue());
        }
        if (this.f11662a != null) {
            bruVar.m10132b(3, this.f11662a.longValue());
        }
        if (this.f11663b != null) {
            bruVar.m10132b(4, this.f11663b.longValue());
        }
        if (this.f11664c != null) {
            bruVar.m10132b(5, this.f11664c.longValue());
        }
        super.mo7777a(bruVar);
    }
}
