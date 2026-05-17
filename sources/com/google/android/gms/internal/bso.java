package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bso extends brw<bso> {

    /* JADX INFO: renamed from: f */
    private static volatile bso[] f8868f;

    /* JADX INFO: renamed from: a */
    public Integer f8869a = null;

    /* JADX INFO: renamed from: b */
    public String f8870b = null;

    /* JADX INFO: renamed from: c */
    public bsj f8871c = null;

    /* JADX INFO: renamed from: g */
    private bsl f8874g = null;

    /* JADX INFO: renamed from: h */
    private Integer f8875h = null;

    /* JADX INFO: renamed from: i */
    private int[] f8876i = bsf.f8816a;

    /* JADX INFO: renamed from: j */
    private String f8877j = null;

    /* JADX INFO: renamed from: d */
    public Integer f8872d = null;

    /* JADX INFO: renamed from: e */
    public String[] f8873e = bsf.f8821f;

    public bso() {
        this.f8769X = null;
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
    public final bso mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 8:
                    this.f8869a = Integer.valueOf(brtVar.m10089c());
                    break;
                case 18:
                    this.f8870b = brtVar.m10093e();
                    break;
                case 26:
                    if (this.f8871c == null) {
                        this.f8871c = new bsj();
                    }
                    brtVar.m10084a(this.f8871c);
                    break;
                case 34:
                    if (this.f8874g == null) {
                        this.f8874g = new bsl();
                    }
                    brtVar.m10084a(this.f8874g);
                    break;
                case 40:
                    this.f8875h = Integer.valueOf(brtVar.m10089c());
                    break;
                case 48:
                    int iM10172a = bsf.m10172a(brtVar, 48);
                    int length = this.f8876i == null ? 0 : this.f8876i.length;
                    int[] iArr = new int[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f8876i, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = brtVar.m10089c();
                        brtVar.m10082a();
                        length++;
                    }
                    iArr[length] = brtVar.m10089c();
                    this.f8876i = iArr;
                    break;
                case 50:
                    int iM10090c = brtVar.m10090c(brtVar.m10096g());
                    int iM10101l = brtVar.m10101l();
                    int i = 0;
                    while (brtVar.m10100k() > 0) {
                        brtVar.m10089c();
                        i++;
                    }
                    brtVar.m10094e(iM10101l);
                    int length2 = this.f8876i == null ? 0 : this.f8876i.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f8876i, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = brtVar.m10089c();
                        length2++;
                    }
                    this.f8876i = iArr2;
                    brtVar.m10091d(iM10090c);
                    break;
                case 58:
                    this.f8877j = brtVar.m10093e();
                    break;
                case 64:
                    int iM10101l2 = brtVar.m10101l();
                    try {
                        int iM10089c = brtVar.m10089c();
                        switch (iM10089c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                this.f8872d = Integer.valueOf(iM10089c);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(46).append(iM10089c).append(" is not a valid enum AdResourceType").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l2);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l2);
                    m10136a(brtVar, iM10082a);
                    break;
                case 74:
                    int iM10172a2 = bsf.m10172a(brtVar, 74);
                    int length3 = this.f8873e == null ? 0 : this.f8873e.length;
                    String[] strArr = new String[iM10172a2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f8873e, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = brtVar.m10093e();
                        brtVar.m10082a();
                        length3++;
                    }
                    strArr[length3] = brtVar.m10093e();
                    this.f8873e = strArr;
                    break;
                default:
                    if (!super.m10136a(brtVar, iM10082a)) {
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static bso[] m10177b() {
        if (f8868f == null) {
            synchronized (bsa.f8811b) {
                if (f8868f == null) {
                    f8868f = new bso[0];
                }
            }
        }
        return f8868f;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a() + bru.m10111b(1, this.f8869a.intValue());
        if (this.f8870b != null) {
            iMo7775a += bru.m10113b(2, this.f8870b);
        }
        if (this.f8871c != null) {
            iMo7775a += bru.m10112b(3, this.f8871c);
        }
        if (this.f8874g != null) {
            iMo7775a += bru.m10112b(4, this.f8874g);
        }
        if (this.f8875h != null) {
            iMo7775a += bru.m10111b(5, this.f8875h.intValue());
        }
        if (this.f8876i != null && this.f8876i.length > 0) {
            int iM10102a = 0;
            for (int i = 0; i < this.f8876i.length; i++) {
                iM10102a += bru.m10102a(this.f8876i[i]);
            }
            iMo7775a = iMo7775a + iM10102a + (this.f8876i.length * 1);
        }
        if (this.f8877j != null) {
            iMo7775a += bru.m10113b(7, this.f8877j);
        }
        if (this.f8872d != null) {
            iMo7775a += bru.m10111b(8, this.f8872d.intValue());
        }
        if (this.f8873e == null || this.f8873e.length <= 0) {
            return iMo7775a;
        }
        int iM10106a = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8873e.length; i3++) {
            String str = this.f8873e[i3];
            if (str != null) {
                i2++;
                iM10106a += bru.m10106a(str);
            }
        }
        return iMo7775a + iM10106a + (i2 * 1);
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        bruVar.m10125a(1, this.f8869a.intValue());
        if (this.f8870b != null) {
            bruVar.m10128a(2, this.f8870b);
        }
        if (this.f8871c != null) {
            bruVar.m10127a(3, this.f8871c);
        }
        if (this.f8874g != null) {
            bruVar.m10127a(4, this.f8874g);
        }
        if (this.f8875h != null) {
            bruVar.m10125a(5, this.f8875h.intValue());
        }
        if (this.f8876i != null && this.f8876i.length > 0) {
            for (int i = 0; i < this.f8876i.length; i++) {
                bruVar.m10125a(6, this.f8876i[i]);
            }
        }
        if (this.f8877j != null) {
            bruVar.m10128a(7, this.f8877j);
        }
        if (this.f8872d != null) {
            bruVar.m10125a(8, this.f8872d.intValue());
        }
        if (this.f8873e != null && this.f8873e.length > 0) {
            for (int i2 = 0; i2 < this.f8873e.length; i2++) {
                String str = this.f8873e[i2];
                if (str != null) {
                    bruVar.m10128a(9, str);
                }
            }
        }
        super.mo7777a(bruVar);
    }
}
