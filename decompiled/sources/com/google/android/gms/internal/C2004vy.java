package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.vy */
/* JADX INFO: loaded from: classes.dex */
public final class C2004vy extends brw<C2004vy> {

    /* JADX INFO: renamed from: a */
    public byte[][] f11843a = bsf.f8822g;

    /* JADX INFO: renamed from: b */
    public byte[] f11844b = null;

    /* JADX INFO: renamed from: c */
    public Integer f11845c;

    /* JADX INFO: renamed from: d */
    private Integer f11846d;

    public C2004vy() {
        this.f8813Y = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        return r7;
     */
    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2004vy mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 10:
                    int iM10172a = bsf.m10172a(brtVar, 10);
                    int length = this.f11843a == null ? 0 : this.f11843a.length;
                    byte[][] bArr = new byte[iM10172a + length][];
                    if (length != 0) {
                        System.arraycopy(this.f11843a, 0, bArr, 0, length);
                    }
                    while (length < bArr.length - 1) {
                        bArr[length] = brtVar.m10095f();
                        brtVar.m10082a();
                        length++;
                    }
                    bArr[length] = brtVar.m10095f();
                    this.f11843a = bArr;
                    break;
                case 18:
                    this.f11844b = brtVar.m10095f();
                    break;
                case 24:
                    int iM10101l = brtVar.m10101l();
                    try {
                        int iM10096g = brtVar.m10096g();
                        switch (iM10096g) {
                            case 0:
                            case 1:
                                this.f11846d = Integer.valueOf(iM10096g);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(41).append(iM10096g).append(" is not a valid enum ProtoName").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l);
                    m10136a(brtVar, iM10082a);
                    break;
                case 32:
                    int iM10101l2 = brtVar.m10101l();
                    try {
                        int iM10096g2 = brtVar.m10096g();
                        switch (iM10096g2) {
                            case 0:
                            case 1:
                            case 2:
                                this.f11845c = Integer.valueOf(iM10096g2);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(48).append(iM10096g2).append(" is not a valid enum EncryptionMethod").toString());
                        }
                    } catch (IllegalArgumentException e2) {
                        brtVar.m10094e(iM10101l2);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l2);
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
        int iM10111b;
        int iMo7775a = super.mo7775a();
        if (this.f11843a == null || this.f11843a.length <= 0) {
            iM10111b = iMo7775a;
        } else {
            int iM10115b = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.f11843a.length; i2++) {
                byte[] bArr = this.f11843a[i2];
                if (bArr != null) {
                    i++;
                    iM10115b += bru.m10115b(bArr);
                }
            }
            iM10111b = iMo7775a + iM10115b + (i * 1);
        }
        if (this.f11844b != null) {
            iM10111b += bru.m10114b(2, this.f11844b);
        }
        if (this.f11846d != null) {
            iM10111b += bru.m10111b(3, this.f11846d.intValue());
        }
        return this.f11845c != null ? iM10111b + bru.m10111b(4, this.f11845c.intValue()) : iM10111b;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f11843a != null && this.f11843a.length > 0) {
            for (int i = 0; i < this.f11843a.length; i++) {
                byte[] bArr = this.f11843a[i];
                if (bArr != null) {
                    bruVar.m10130a(1, bArr);
                }
            }
        }
        if (this.f11844b != null) {
            bruVar.m10130a(2, this.f11844b);
        }
        if (this.f11846d != null) {
            bruVar.m10125a(3, this.f11846d.intValue());
        }
        if (this.f11845c != null) {
            bruVar.m10125a(4, this.f11845c.intValue());
        }
        super.mo7777a(bruVar);
    }
}
