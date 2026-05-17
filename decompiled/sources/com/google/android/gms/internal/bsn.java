package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsn extends brw<bsn> {

    /* JADX INFO: renamed from: a */
    public Integer f8865a = null;

    /* JADX INFO: renamed from: b */
    public String f8866b = null;

    /* JADX INFO: renamed from: c */
    public byte[] f8867c = null;

    public bsn() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        return r6;
     */
    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bsn mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 8:
                    int iM10101l = brtVar.m10101l();
                    try {
                        int iM10089c = brtVar.m10089c();
                        switch (iM10089c) {
                            case 0:
                            case 1:
                                this.f8865a = Integer.valueOf(iM10089c);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(36).append(iM10089c).append(" is not a valid enum Type").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l);
                    m10136a(brtVar, iM10082a);
                    break;
                case 18:
                    this.f8866b = brtVar.m10093e();
                    break;
                case 26:
                    this.f8867c = brtVar.m10095f();
                    break;
                default:
                    if (!super.m10136a(brtVar, iM10082a)) {
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8865a != null) {
            iMo7775a += bru.m10111b(1, this.f8865a.intValue());
        }
        if (this.f8866b != null) {
            iMo7775a += bru.m10113b(2, this.f8866b);
        }
        return this.f8867c != null ? iMo7775a + bru.m10114b(3, this.f8867c) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f8865a != null) {
            bruVar.m10125a(1, this.f8865a.intValue());
        }
        if (this.f8866b != null) {
            bruVar.m10128a(2, this.f8866b);
        }
        if (this.f8867c != null) {
            bruVar.m10130a(3, this.f8867c);
        }
        super.mo7777a(bruVar);
    }
}
