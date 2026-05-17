package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.uq */
/* JADX INFO: loaded from: classes.dex */
public final class C1969uq extends brw<C1969uq> {

    /* JADX INFO: renamed from: a */
    private Long f11677a = null;

    /* JADX INFO: renamed from: b */
    private Integer f11678b = null;

    /* JADX INFO: renamed from: c */
    private Boolean f11679c = null;

    /* JADX INFO: renamed from: d */
    private int[] f11680d = bsf.f8816a;

    /* JADX INFO: renamed from: e */
    private Long f11681e = null;

    public C1969uq() {
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11677a != null) {
            iMo7775a += bru.m10118c(1, this.f11677a.longValue());
        }
        if (this.f11678b != null) {
            iMo7775a += bru.m10111b(2, this.f11678b.intValue());
        }
        if (this.f11679c != null) {
            this.f11679c.booleanValue();
            iMo7775a += bru.m10110b(3) + 1;
        }
        if (this.f11680d != null && this.f11680d.length > 0) {
            int iM10102a = 0;
            for (int i = 0; i < this.f11680d.length; i++) {
                iM10102a += bru.m10102a(this.f11680d[i]);
            }
            iMo7775a = iMo7775a + iM10102a + (this.f11680d.length * 1);
        }
        if (this.f11681e == null) {
            return iMo7775a;
        }
        return iMo7775a + bru.m10110b(5) + bru.m10103a(this.f11681e.longValue());
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
                    this.f11677a = Long.valueOf(brtVar.m10097h());
                    break;
                case 16:
                    this.f11678b = Integer.valueOf(brtVar.m10096g());
                    break;
                case 24:
                    this.f11679c = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 32:
                    int iM10172a = bsf.m10172a(brtVar, 32);
                    int length = this.f11680d == null ? 0 : this.f11680d.length;
                    int[] iArr = new int[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f11680d, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = brtVar.m10096g();
                        brtVar.m10082a();
                        length++;
                    }
                    iArr[length] = brtVar.m10096g();
                    this.f11680d = iArr;
                    break;
                case 34:
                    int iM10090c = brtVar.m10090c(brtVar.m10096g());
                    int iM10101l = brtVar.m10101l();
                    int i = 0;
                    while (brtVar.m10100k() > 0) {
                        brtVar.m10096g();
                        i++;
                    }
                    brtVar.m10094e(iM10101l);
                    int length2 = this.f11680d == null ? 0 : this.f11680d.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f11680d, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = brtVar.m10096g();
                        length2++;
                    }
                    this.f11680d = iArr2;
                    brtVar.m10091d(iM10090c);
                    break;
                case 40:
                    this.f11681e = Long.valueOf(brtVar.m10097h());
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
        if (this.f11677a != null) {
            bruVar.m10132b(1, this.f11677a.longValue());
        }
        if (this.f11678b != null) {
            bruVar.m10125a(2, this.f11678b.intValue());
        }
        if (this.f11679c != null) {
            bruVar.m10129a(3, this.f11679c.booleanValue());
        }
        if (this.f11680d != null && this.f11680d.length > 0) {
            for (int i = 0; i < this.f11680d.length; i++) {
                bruVar.m10125a(4, this.f11680d[i]);
            }
        }
        if (this.f11681e != null) {
            bruVar.m10126a(5, this.f11681e.longValue());
        }
        super.mo7777a(bruVar);
    }
}
