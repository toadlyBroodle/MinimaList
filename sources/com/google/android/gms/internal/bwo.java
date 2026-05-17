package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bwo extends brw<bwo> {

    /* JADX INFO: renamed from: a */
    public Integer f9195a = null;

    public bwo() {
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
    public final bwo mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 56:
                    int iM10101l = brtVar.m10101l();
                    try {
                        int iM10096g = brtVar.m10096g();
                        switch (iM10096g) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                this.f9195a = Integer.valueOf(iM10096g);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(43).append(iM10096g).append(" is not a valid enum AdInitiater").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l);
                    m10136a(brtVar, iM10082a);
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
        return this.f9195a != null ? iMo7775a + bru.m10111b(7, this.f9195a.intValue()) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f9195a != null) {
            bruVar.m10125a(7, this.f9195a.intValue());
        }
        super.mo7777a(bruVar);
    }
}
