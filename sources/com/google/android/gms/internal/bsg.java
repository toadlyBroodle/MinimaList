package com.google.android.gms.internal;

import android.support.design.C0025a;

/* JADX INFO: loaded from: classes.dex */
public final class bsg extends brw<bsg> {

    /* JADX INFO: renamed from: a */
    public Integer f8828a = null;

    /* JADX INFO: renamed from: i */
    private Integer f8836i = null;

    /* JADX INFO: renamed from: b */
    public String f8829b = null;

    /* JADX INFO: renamed from: c */
    public String f8830c = null;

    /* JADX INFO: renamed from: j */
    private String f8837j = null;

    /* JADX INFO: renamed from: d */
    public bsh f8831d = null;

    /* JADX INFO: renamed from: e */
    public bso[] f8832e = bso.m10177b();

    /* JADX INFO: renamed from: f */
    public String f8833f = null;

    /* JADX INFO: renamed from: g */
    public bsn f8834g = null;

    /* JADX INFO: renamed from: k */
    private Boolean f8838k = null;

    /* JADX INFO: renamed from: l */
    private String[] f8839l = bsf.f8821f;

    /* JADX INFO: renamed from: m */
    private String f8840m = null;

    /* JADX INFO: renamed from: n */
    private Boolean f8841n = null;

    /* JADX INFO: renamed from: o */
    private Boolean f8842o = null;

    /* JADX INFO: renamed from: p */
    private byte[] f8843p = null;

    /* JADX INFO: renamed from: h */
    public bsp f8835h = null;

    public bsg() {
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
    public final bsg mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 10:
                    this.f8829b = brtVar.m10093e();
                    break;
                case 18:
                    this.f8830c = brtVar.m10093e();
                    break;
                case 26:
                    this.f8837j = brtVar.m10093e();
                    break;
                case 34:
                    int iM10172a = bsf.m10172a(brtVar, 34);
                    int length = this.f8832e == null ? 0 : this.f8832e.length;
                    bso[] bsoVarArr = new bso[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f8832e, 0, bsoVarArr, 0, length);
                    }
                    while (length < bsoVarArr.length - 1) {
                        bsoVarArr[length] = new bso();
                        brtVar.m10084a(bsoVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    bsoVarArr[length] = new bso();
                    brtVar.m10084a(bsoVarArr[length]);
                    this.f8832e = bsoVarArr;
                    break;
                case 40:
                    this.f8838k = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 50:
                    int iM10172a2 = bsf.m10172a(brtVar, 50);
                    int length2 = this.f8839l == null ? 0 : this.f8839l.length;
                    String[] strArr = new String[iM10172a2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f8839l, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = brtVar.m10093e();
                        brtVar.m10082a();
                        length2++;
                    }
                    strArr[length2] = brtVar.m10093e();
                    this.f8839l = strArr;
                    break;
                case 58:
                    this.f8840m = brtVar.m10093e();
                    break;
                case 64:
                    this.f8841n = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 72:
                    this.f8842o = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 80:
                    int iM10101l = brtVar.m10101l();
                    try {
                        int iM10089c = brtVar.m10089c();
                        switch (iM10089c) {
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
                                this.f8828a = Integer.valueOf(iM10089c);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(42).append(iM10089c).append(" is not a valid enum ReportType").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l);
                    m10136a(brtVar, iM10082a);
                    break;
                case 88:
                    int iM10101l2 = brtVar.m10101l();
                    try {
                        int iM10089c2 = brtVar.m10089c();
                        switch (iM10089c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                this.f8836i = Integer.valueOf(iM10089c2);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(39).append(iM10089c2).append(" is not a valid enum Verdict").toString());
                        }
                    } catch (IllegalArgumentException e2) {
                        brtVar.m10094e(iM10101l2);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l2);
                    m10136a(brtVar, iM10082a);
                    break;
                case 98:
                    if (this.f8831d == null) {
                        this.f8831d = new bsh();
                    }
                    brtVar.m10084a(this.f8831d);
                    break;
                case 106:
                    this.f8833f = brtVar.m10093e();
                    break;
                case C0025a.j.AppCompatTheme_windowFixedWidthMajor /* 114 */:
                    if (this.f8834g == null) {
                        this.f8834g = new bsn();
                    }
                    brtVar.m10084a(this.f8834g);
                    break;
                case 122:
                    this.f8843p = brtVar.m10095f();
                    break;
                case 138:
                    if (this.f8835h == null) {
                        this.f8835h = new bsp();
                    }
                    brtVar.m10084a(this.f8835h);
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
        if (this.f8829b != null) {
            iMo7775a += bru.m10113b(1, this.f8829b);
        }
        if (this.f8830c != null) {
            iMo7775a += bru.m10113b(2, this.f8830c);
        }
        if (this.f8837j != null) {
            iMo7775a += bru.m10113b(3, this.f8837j);
        }
        if (this.f8832e != null && this.f8832e.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f8832e.length; i++) {
                bso bsoVar = this.f8832e[i];
                if (bsoVar != null) {
                    iM10112b += bru.m10112b(4, bsoVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f8838k != null) {
            this.f8838k.booleanValue();
            iMo7775a += bru.m10110b(5) + 1;
        }
        if (this.f8839l != null && this.f8839l.length > 0) {
            int iM10106a = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f8839l.length; i3++) {
                String str = this.f8839l[i3];
                if (str != null) {
                    i2++;
                    iM10106a += bru.m10106a(str);
                }
            }
            iMo7775a = iMo7775a + iM10106a + (i2 * 1);
        }
        if (this.f8840m != null) {
            iMo7775a += bru.m10113b(7, this.f8840m);
        }
        if (this.f8841n != null) {
            this.f8841n.booleanValue();
            iMo7775a += bru.m10110b(8) + 1;
        }
        if (this.f8842o != null) {
            this.f8842o.booleanValue();
            iMo7775a += bru.m10110b(9) + 1;
        }
        if (this.f8828a != null) {
            iMo7775a += bru.m10111b(10, this.f8828a.intValue());
        }
        if (this.f8836i != null) {
            iMo7775a += bru.m10111b(11, this.f8836i.intValue());
        }
        if (this.f8831d != null) {
            iMo7775a += bru.m10112b(12, this.f8831d);
        }
        if (this.f8833f != null) {
            iMo7775a += bru.m10113b(13, this.f8833f);
        }
        if (this.f8834g != null) {
            iMo7775a += bru.m10112b(14, this.f8834g);
        }
        if (this.f8843p != null) {
            iMo7775a += bru.m10114b(15, this.f8843p);
        }
        return this.f8835h != null ? iMo7775a + bru.m10112b(17, this.f8835h) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f8829b != null) {
            bruVar.m10128a(1, this.f8829b);
        }
        if (this.f8830c != null) {
            bruVar.m10128a(2, this.f8830c);
        }
        if (this.f8837j != null) {
            bruVar.m10128a(3, this.f8837j);
        }
        if (this.f8832e != null && this.f8832e.length > 0) {
            for (int i = 0; i < this.f8832e.length; i++) {
                bso bsoVar = this.f8832e[i];
                if (bsoVar != null) {
                    bruVar.m10127a(4, bsoVar);
                }
            }
        }
        if (this.f8838k != null) {
            bruVar.m10129a(5, this.f8838k.booleanValue());
        }
        if (this.f8839l != null && this.f8839l.length > 0) {
            for (int i2 = 0; i2 < this.f8839l.length; i2++) {
                String str = this.f8839l[i2];
                if (str != null) {
                    bruVar.m10128a(6, str);
                }
            }
        }
        if (this.f8840m != null) {
            bruVar.m10128a(7, this.f8840m);
        }
        if (this.f8841n != null) {
            bruVar.m10129a(8, this.f8841n.booleanValue());
        }
        if (this.f8842o != null) {
            bruVar.m10129a(9, this.f8842o.booleanValue());
        }
        if (this.f8828a != null) {
            bruVar.m10125a(10, this.f8828a.intValue());
        }
        if (this.f8836i != null) {
            bruVar.m10125a(11, this.f8836i.intValue());
        }
        if (this.f8831d != null) {
            bruVar.m10127a(12, this.f8831d);
        }
        if (this.f8833f != null) {
            bruVar.m10128a(13, this.f8833f);
        }
        if (this.f8834g != null) {
            bruVar.m10127a(14, this.f8834g);
        }
        if (this.f8843p != null) {
            bruVar.m10130a(15, this.f8843p);
        }
        if (this.f8835h != null) {
            bruVar.m10127a(17, this.f8835h);
        }
        super.mo7777a(bruVar);
    }
}
