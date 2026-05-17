package com.google.android.gms.internal;

import android.support.design.C0025a;

/* JADX INFO: loaded from: classes.dex */
public final class aez extends brw<aez> {

    /* JADX INFO: renamed from: H */
    private static volatile aez[] f6566H;

    /* JADX INFO: renamed from: a */
    public Integer f6576a = null;

    /* JADX INFO: renamed from: b */
    public aew[] f6577b = aew.m7786b();

    /* JADX INFO: renamed from: c */
    public afb[] f6578c = afb.m7789b();

    /* JADX INFO: renamed from: d */
    public Long f6579d = null;

    /* JADX INFO: renamed from: e */
    public Long f6580e = null;

    /* JADX INFO: renamed from: f */
    public Long f6581f = null;

    /* JADX INFO: renamed from: g */
    public Long f6582g = null;

    /* JADX INFO: renamed from: h */
    public Long f6583h = null;

    /* JADX INFO: renamed from: i */
    public String f6584i = null;

    /* JADX INFO: renamed from: j */
    public String f6585j = null;

    /* JADX INFO: renamed from: k */
    public String f6586k = null;

    /* JADX INFO: renamed from: l */
    public String f6587l = null;

    /* JADX INFO: renamed from: m */
    public Integer f6588m = null;

    /* JADX INFO: renamed from: n */
    public String f6589n = null;

    /* JADX INFO: renamed from: o */
    public String f6590o = null;

    /* JADX INFO: renamed from: p */
    public String f6591p = null;

    /* JADX INFO: renamed from: q */
    public Long f6592q = null;

    /* JADX INFO: renamed from: r */
    public Long f6593r = null;

    /* JADX INFO: renamed from: s */
    public String f6594s = null;

    /* JADX INFO: renamed from: t */
    public Boolean f6595t = null;

    /* JADX INFO: renamed from: u */
    public String f6596u = null;

    /* JADX INFO: renamed from: v */
    public Long f6597v = null;

    /* JADX INFO: renamed from: w */
    public Integer f6598w = null;

    /* JADX INFO: renamed from: x */
    public String f6599x = null;

    /* JADX INFO: renamed from: y */
    public String f6600y = null;

    /* JADX INFO: renamed from: z */
    public Boolean f6601z = null;

    /* JADX INFO: renamed from: A */
    public aev[] f6567A = aev.m7785b();

    /* JADX INFO: renamed from: B */
    public String f6568B = null;

    /* JADX INFO: renamed from: C */
    public Integer f6569C = null;

    /* JADX INFO: renamed from: I */
    private Integer f6574I = null;

    /* JADX INFO: renamed from: J */
    private Integer f6575J = null;

    /* JADX INFO: renamed from: D */
    public String f6570D = null;

    /* JADX INFO: renamed from: E */
    public Long f6571E = null;

    /* JADX INFO: renamed from: F */
    public Long f6572F = null;

    /* JADX INFO: renamed from: G */
    public String f6573G = null;

    public aez() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: b */
    public static aez[] m7788b() {
        if (f6566H == null) {
            synchronized (bsa.f8811b) {
                if (f6566H == null) {
                    f6566H = new aez[0];
                }
            }
        }
        return f6566H;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f6576a != null) {
            iMo7775a += bru.m10111b(1, this.f6576a.intValue());
        }
        if (this.f6577b != null && this.f6577b.length > 0) {
            int iM10112b = iMo7775a;
            for (int i = 0; i < this.f6577b.length; i++) {
                aew aewVar = this.f6577b[i];
                if (aewVar != null) {
                    iM10112b += bru.m10112b(2, aewVar);
                }
            }
            iMo7775a = iM10112b;
        }
        if (this.f6578c != null && this.f6578c.length > 0) {
            int iM10112b2 = iMo7775a;
            for (int i2 = 0; i2 < this.f6578c.length; i2++) {
                afb afbVar = this.f6578c[i2];
                if (afbVar != null) {
                    iM10112b2 += bru.m10112b(3, afbVar);
                }
            }
            iMo7775a = iM10112b2;
        }
        if (this.f6579d != null) {
            iMo7775a += bru.m10118c(4, this.f6579d.longValue());
        }
        if (this.f6580e != null) {
            iMo7775a += bru.m10118c(5, this.f6580e.longValue());
        }
        if (this.f6581f != null) {
            iMo7775a += bru.m10118c(6, this.f6581f.longValue());
        }
        if (this.f6583h != null) {
            iMo7775a += bru.m10118c(7, this.f6583h.longValue());
        }
        if (this.f6584i != null) {
            iMo7775a += bru.m10113b(8, this.f6584i);
        }
        if (this.f6585j != null) {
            iMo7775a += bru.m10113b(9, this.f6585j);
        }
        if (this.f6586k != null) {
            iMo7775a += bru.m10113b(10, this.f6586k);
        }
        if (this.f6587l != null) {
            iMo7775a += bru.m10113b(11, this.f6587l);
        }
        if (this.f6588m != null) {
            iMo7775a += bru.m10111b(12, this.f6588m.intValue());
        }
        if (this.f6589n != null) {
            iMo7775a += bru.m10113b(13, this.f6589n);
        }
        if (this.f6590o != null) {
            iMo7775a += bru.m10113b(14, this.f6590o);
        }
        if (this.f6591p != null) {
            iMo7775a += bru.m10113b(16, this.f6591p);
        }
        if (this.f6592q != null) {
            iMo7775a += bru.m10118c(17, this.f6592q.longValue());
        }
        if (this.f6593r != null) {
            iMo7775a += bru.m10118c(18, this.f6593r.longValue());
        }
        if (this.f6594s != null) {
            iMo7775a += bru.m10113b(19, this.f6594s);
        }
        if (this.f6595t != null) {
            this.f6595t.booleanValue();
            iMo7775a += bru.m10110b(20) + 1;
        }
        if (this.f6596u != null) {
            iMo7775a += bru.m10113b(21, this.f6596u);
        }
        if (this.f6597v != null) {
            iMo7775a += bru.m10118c(22, this.f6597v.longValue());
        }
        if (this.f6598w != null) {
            iMo7775a += bru.m10111b(23, this.f6598w.intValue());
        }
        if (this.f6599x != null) {
            iMo7775a += bru.m10113b(24, this.f6599x);
        }
        if (this.f6600y != null) {
            iMo7775a += bru.m10113b(25, this.f6600y);
        }
        if (this.f6582g != null) {
            iMo7775a += bru.m10118c(26, this.f6582g.longValue());
        }
        if (this.f6601z != null) {
            this.f6601z.booleanValue();
            iMo7775a += bru.m10110b(28) + 1;
        }
        if (this.f6567A != null && this.f6567A.length > 0) {
            for (int i3 = 0; i3 < this.f6567A.length; i3++) {
                aev aevVar = this.f6567A[i3];
                if (aevVar != null) {
                    iMo7775a += bru.m10112b(29, aevVar);
                }
            }
        }
        if (this.f6568B != null) {
            iMo7775a += bru.m10113b(30, this.f6568B);
        }
        if (this.f6569C != null) {
            iMo7775a += bru.m10111b(31, this.f6569C.intValue());
        }
        if (this.f6574I != null) {
            iMo7775a += bru.m10111b(32, this.f6574I.intValue());
        }
        if (this.f6575J != null) {
            iMo7775a += bru.m10111b(33, this.f6575J.intValue());
        }
        if (this.f6570D != null) {
            iMo7775a += bru.m10113b(34, this.f6570D);
        }
        if (this.f6571E != null) {
            iMo7775a += bru.m10118c(35, this.f6571E.longValue());
        }
        if (this.f6572F != null) {
            iMo7775a += bru.m10118c(36, this.f6572F.longValue());
        }
        return this.f6573G != null ? iMo7775a + bru.m10113b(37, this.f6573G) : iMo7775a;
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
                    this.f6576a = Integer.valueOf(brtVar.m10096g());
                    break;
                case 18:
                    int iM10172a = bsf.m10172a(brtVar, 18);
                    int length = this.f6577b == null ? 0 : this.f6577b.length;
                    aew[] aewVarArr = new aew[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6577b, 0, aewVarArr, 0, length);
                    }
                    while (length < aewVarArr.length - 1) {
                        aewVarArr[length] = new aew();
                        brtVar.m10084a(aewVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    aewVarArr[length] = new aew();
                    brtVar.m10084a(aewVarArr[length]);
                    this.f6577b = aewVarArr;
                    break;
                case 26:
                    int iM10172a2 = bsf.m10172a(brtVar, 26);
                    int length2 = this.f6578c == null ? 0 : this.f6578c.length;
                    afb[] afbVarArr = new afb[iM10172a2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f6578c, 0, afbVarArr, 0, length2);
                    }
                    while (length2 < afbVarArr.length - 1) {
                        afbVarArr[length2] = new afb();
                        brtVar.m10084a(afbVarArr[length2]);
                        brtVar.m10082a();
                        length2++;
                    }
                    afbVarArr[length2] = new afb();
                    brtVar.m10084a(afbVarArr[length2]);
                    this.f6578c = afbVarArr;
                    break;
                case 32:
                    this.f6579d = Long.valueOf(brtVar.m10097h());
                    break;
                case 40:
                    this.f6580e = Long.valueOf(brtVar.m10097h());
                    break;
                case 48:
                    this.f6581f = Long.valueOf(brtVar.m10097h());
                    break;
                case 56:
                    this.f6583h = Long.valueOf(brtVar.m10097h());
                    break;
                case 66:
                    this.f6584i = brtVar.m10093e();
                    break;
                case 74:
                    this.f6585j = brtVar.m10093e();
                    break;
                case 82:
                    this.f6586k = brtVar.m10093e();
                    break;
                case 90:
                    this.f6587l = brtVar.m10093e();
                    break;
                case 96:
                    this.f6588m = Integer.valueOf(brtVar.m10096g());
                    break;
                case 106:
                    this.f6589n = brtVar.m10093e();
                    break;
                case C0025a.j.AppCompatTheme_windowFixedWidthMajor /* 114 */:
                    this.f6590o = brtVar.m10093e();
                    break;
                case 130:
                    this.f6591p = brtVar.m10093e();
                    break;
                case 136:
                    this.f6592q = Long.valueOf(brtVar.m10097h());
                    break;
                case 144:
                    this.f6593r = Long.valueOf(brtVar.m10097h());
                    break;
                case 154:
                    this.f6594s = brtVar.m10093e();
                    break;
                case 160:
                    this.f6595t = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 170:
                    this.f6596u = brtVar.m10093e();
                    break;
                case 176:
                    this.f6597v = Long.valueOf(brtVar.m10097h());
                    break;
                case 184:
                    this.f6598w = Integer.valueOf(brtVar.m10096g());
                    break;
                case 194:
                    this.f6599x = brtVar.m10093e();
                    break;
                case 202:
                    this.f6600y = brtVar.m10093e();
                    break;
                case 208:
                    this.f6582g = Long.valueOf(brtVar.m10097h());
                    break;
                case 224:
                    this.f6601z = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 234:
                    int iM10172a3 = bsf.m10172a(brtVar, 234);
                    int length3 = this.f6567A == null ? 0 : this.f6567A.length;
                    aev[] aevVarArr = new aev[iM10172a3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f6567A, 0, aevVarArr, 0, length3);
                    }
                    while (length3 < aevVarArr.length - 1) {
                        aevVarArr[length3] = new aev();
                        brtVar.m10084a(aevVarArr[length3]);
                        brtVar.m10082a();
                        length3++;
                    }
                    aevVarArr[length3] = new aev();
                    brtVar.m10084a(aevVarArr[length3]);
                    this.f6567A = aevVarArr;
                    break;
                case 242:
                    this.f6568B = brtVar.m10093e();
                    break;
                case 248:
                    this.f6569C = Integer.valueOf(brtVar.m10096g());
                    break;
                case 256:
                    this.f6574I = Integer.valueOf(brtVar.m10096g());
                    break;
                case 264:
                    this.f6575J = Integer.valueOf(brtVar.m10096g());
                    break;
                case 274:
                    this.f6570D = brtVar.m10093e();
                    break;
                case 280:
                    this.f6571E = Long.valueOf(brtVar.m10097h());
                    break;
                case 288:
                    this.f6572F = Long.valueOf(brtVar.m10097h());
                    break;
                case 298:
                    this.f6573G = brtVar.m10093e();
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
        if (this.f6576a != null) {
            bruVar.m10125a(1, this.f6576a.intValue());
        }
        if (this.f6577b != null && this.f6577b.length > 0) {
            for (int i = 0; i < this.f6577b.length; i++) {
                aew aewVar = this.f6577b[i];
                if (aewVar != null) {
                    bruVar.m10127a(2, aewVar);
                }
            }
        }
        if (this.f6578c != null && this.f6578c.length > 0) {
            for (int i2 = 0; i2 < this.f6578c.length; i2++) {
                afb afbVar = this.f6578c[i2];
                if (afbVar != null) {
                    bruVar.m10127a(3, afbVar);
                }
            }
        }
        if (this.f6579d != null) {
            bruVar.m10132b(4, this.f6579d.longValue());
        }
        if (this.f6580e != null) {
            bruVar.m10132b(5, this.f6580e.longValue());
        }
        if (this.f6581f != null) {
            bruVar.m10132b(6, this.f6581f.longValue());
        }
        if (this.f6583h != null) {
            bruVar.m10132b(7, this.f6583h.longValue());
        }
        if (this.f6584i != null) {
            bruVar.m10128a(8, this.f6584i);
        }
        if (this.f6585j != null) {
            bruVar.m10128a(9, this.f6585j);
        }
        if (this.f6586k != null) {
            bruVar.m10128a(10, this.f6586k);
        }
        if (this.f6587l != null) {
            bruVar.m10128a(11, this.f6587l);
        }
        if (this.f6588m != null) {
            bruVar.m10125a(12, this.f6588m.intValue());
        }
        if (this.f6589n != null) {
            bruVar.m10128a(13, this.f6589n);
        }
        if (this.f6590o != null) {
            bruVar.m10128a(14, this.f6590o);
        }
        if (this.f6591p != null) {
            bruVar.m10128a(16, this.f6591p);
        }
        if (this.f6592q != null) {
            bruVar.m10132b(17, this.f6592q.longValue());
        }
        if (this.f6593r != null) {
            bruVar.m10132b(18, this.f6593r.longValue());
        }
        if (this.f6594s != null) {
            bruVar.m10128a(19, this.f6594s);
        }
        if (this.f6595t != null) {
            bruVar.m10129a(20, this.f6595t.booleanValue());
        }
        if (this.f6596u != null) {
            bruVar.m10128a(21, this.f6596u);
        }
        if (this.f6597v != null) {
            bruVar.m10132b(22, this.f6597v.longValue());
        }
        if (this.f6598w != null) {
            bruVar.m10125a(23, this.f6598w.intValue());
        }
        if (this.f6599x != null) {
            bruVar.m10128a(24, this.f6599x);
        }
        if (this.f6600y != null) {
            bruVar.m10128a(25, this.f6600y);
        }
        if (this.f6582g != null) {
            bruVar.m10132b(26, this.f6582g.longValue());
        }
        if (this.f6601z != null) {
            bruVar.m10129a(28, this.f6601z.booleanValue());
        }
        if (this.f6567A != null && this.f6567A.length > 0) {
            for (int i3 = 0; i3 < this.f6567A.length; i3++) {
                aev aevVar = this.f6567A[i3];
                if (aevVar != null) {
                    bruVar.m10127a(29, aevVar);
                }
            }
        }
        if (this.f6568B != null) {
            bruVar.m10128a(30, this.f6568B);
        }
        if (this.f6569C != null) {
            bruVar.m10125a(31, this.f6569C.intValue());
        }
        if (this.f6574I != null) {
            bruVar.m10125a(32, this.f6574I.intValue());
        }
        if (this.f6575J != null) {
            bruVar.m10125a(33, this.f6575J.intValue());
        }
        if (this.f6570D != null) {
            bruVar.m10128a(34, this.f6570D);
        }
        if (this.f6571E != null) {
            bruVar.m10132b(35, this.f6571E.longValue());
        }
        if (this.f6572F != null) {
            bruVar.m10132b(36, this.f6572F.longValue());
        }
        if (this.f6573G != null) {
            bruVar.m10128a(37, this.f6573G);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aez)) {
            return false;
        }
        aez aezVar = (aez) obj;
        if (this.f6576a == null) {
            if (aezVar.f6576a != null) {
                return false;
            }
        } else if (!this.f6576a.equals(aezVar.f6576a)) {
            return false;
        }
        if (bsa.m10157a(this.f6577b, aezVar.f6577b) && bsa.m10157a(this.f6578c, aezVar.f6578c)) {
            if (this.f6579d == null) {
                if (aezVar.f6579d != null) {
                    return false;
                }
            } else if (!this.f6579d.equals(aezVar.f6579d)) {
                return false;
            }
            if (this.f6580e == null) {
                if (aezVar.f6580e != null) {
                    return false;
                }
            } else if (!this.f6580e.equals(aezVar.f6580e)) {
                return false;
            }
            if (this.f6581f == null) {
                if (aezVar.f6581f != null) {
                    return false;
                }
            } else if (!this.f6581f.equals(aezVar.f6581f)) {
                return false;
            }
            if (this.f6582g == null) {
                if (aezVar.f6582g != null) {
                    return false;
                }
            } else if (!this.f6582g.equals(aezVar.f6582g)) {
                return false;
            }
            if (this.f6583h == null) {
                if (aezVar.f6583h != null) {
                    return false;
                }
            } else if (!this.f6583h.equals(aezVar.f6583h)) {
                return false;
            }
            if (this.f6584i == null) {
                if (aezVar.f6584i != null) {
                    return false;
                }
            } else if (!this.f6584i.equals(aezVar.f6584i)) {
                return false;
            }
            if (this.f6585j == null) {
                if (aezVar.f6585j != null) {
                    return false;
                }
            } else if (!this.f6585j.equals(aezVar.f6585j)) {
                return false;
            }
            if (this.f6586k == null) {
                if (aezVar.f6586k != null) {
                    return false;
                }
            } else if (!this.f6586k.equals(aezVar.f6586k)) {
                return false;
            }
            if (this.f6587l == null) {
                if (aezVar.f6587l != null) {
                    return false;
                }
            } else if (!this.f6587l.equals(aezVar.f6587l)) {
                return false;
            }
            if (this.f6588m == null) {
                if (aezVar.f6588m != null) {
                    return false;
                }
            } else if (!this.f6588m.equals(aezVar.f6588m)) {
                return false;
            }
            if (this.f6589n == null) {
                if (aezVar.f6589n != null) {
                    return false;
                }
            } else if (!this.f6589n.equals(aezVar.f6589n)) {
                return false;
            }
            if (this.f6590o == null) {
                if (aezVar.f6590o != null) {
                    return false;
                }
            } else if (!this.f6590o.equals(aezVar.f6590o)) {
                return false;
            }
            if (this.f6591p == null) {
                if (aezVar.f6591p != null) {
                    return false;
                }
            } else if (!this.f6591p.equals(aezVar.f6591p)) {
                return false;
            }
            if (this.f6592q == null) {
                if (aezVar.f6592q != null) {
                    return false;
                }
            } else if (!this.f6592q.equals(aezVar.f6592q)) {
                return false;
            }
            if (this.f6593r == null) {
                if (aezVar.f6593r != null) {
                    return false;
                }
            } else if (!this.f6593r.equals(aezVar.f6593r)) {
                return false;
            }
            if (this.f6594s == null) {
                if (aezVar.f6594s != null) {
                    return false;
                }
            } else if (!this.f6594s.equals(aezVar.f6594s)) {
                return false;
            }
            if (this.f6595t == null) {
                if (aezVar.f6595t != null) {
                    return false;
                }
            } else if (!this.f6595t.equals(aezVar.f6595t)) {
                return false;
            }
            if (this.f6596u == null) {
                if (aezVar.f6596u != null) {
                    return false;
                }
            } else if (!this.f6596u.equals(aezVar.f6596u)) {
                return false;
            }
            if (this.f6597v == null) {
                if (aezVar.f6597v != null) {
                    return false;
                }
            } else if (!this.f6597v.equals(aezVar.f6597v)) {
                return false;
            }
            if (this.f6598w == null) {
                if (aezVar.f6598w != null) {
                    return false;
                }
            } else if (!this.f6598w.equals(aezVar.f6598w)) {
                return false;
            }
            if (this.f6599x == null) {
                if (aezVar.f6599x != null) {
                    return false;
                }
            } else if (!this.f6599x.equals(aezVar.f6599x)) {
                return false;
            }
            if (this.f6600y == null) {
                if (aezVar.f6600y != null) {
                    return false;
                }
            } else if (!this.f6600y.equals(aezVar.f6600y)) {
                return false;
            }
            if (this.f6601z == null) {
                if (aezVar.f6601z != null) {
                    return false;
                }
            } else if (!this.f6601z.equals(aezVar.f6601z)) {
                return false;
            }
            if (!bsa.m10157a(this.f6567A, aezVar.f6567A)) {
                return false;
            }
            if (this.f6568B == null) {
                if (aezVar.f6568B != null) {
                    return false;
                }
            } else if (!this.f6568B.equals(aezVar.f6568B)) {
                return false;
            }
            if (this.f6569C == null) {
                if (aezVar.f6569C != null) {
                    return false;
                }
            } else if (!this.f6569C.equals(aezVar.f6569C)) {
                return false;
            }
            if (this.f6574I == null) {
                if (aezVar.f6574I != null) {
                    return false;
                }
            } else if (!this.f6574I.equals(aezVar.f6574I)) {
                return false;
            }
            if (this.f6575J == null) {
                if (aezVar.f6575J != null) {
                    return false;
                }
            } else if (!this.f6575J.equals(aezVar.f6575J)) {
                return false;
            }
            if (this.f6570D == null) {
                if (aezVar.f6570D != null) {
                    return false;
                }
            } else if (!this.f6570D.equals(aezVar.f6570D)) {
                return false;
            }
            if (this.f6571E == null) {
                if (aezVar.f6571E != null) {
                    return false;
                }
            } else if (!this.f6571E.equals(aezVar.f6571E)) {
                return false;
            }
            if (this.f6572F == null) {
                if (aezVar.f6572F != null) {
                    return false;
                }
            } else if (!this.f6572F.equals(aezVar.f6572F)) {
                return false;
            }
            if (this.f6573G == null) {
                if (aezVar.f6573G != null) {
                    return false;
                }
            } else if (!this.f6573G.equals(aezVar.f6573G)) {
                return false;
            }
            return (this.f8769X == null || this.f8769X.m10147b()) ? aezVar.f8769X == null || aezVar.f8769X.m10147b() : this.f8769X.equals(aezVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6573G == null ? 0 : this.f6573G.hashCode()) + (((this.f6572F == null ? 0 : this.f6572F.hashCode()) + (((this.f6571E == null ? 0 : this.f6571E.hashCode()) + (((this.f6570D == null ? 0 : this.f6570D.hashCode()) + (((this.f6575J == null ? 0 : this.f6575J.hashCode()) + (((this.f6574I == null ? 0 : this.f6574I.hashCode()) + (((this.f6569C == null ? 0 : this.f6569C.hashCode()) + (((this.f6568B == null ? 0 : this.f6568B.hashCode()) + (((((this.f6601z == null ? 0 : this.f6601z.hashCode()) + (((this.f6600y == null ? 0 : this.f6600y.hashCode()) + (((this.f6599x == null ? 0 : this.f6599x.hashCode()) + (((this.f6598w == null ? 0 : this.f6598w.hashCode()) + (((this.f6597v == null ? 0 : this.f6597v.hashCode()) + (((this.f6596u == null ? 0 : this.f6596u.hashCode()) + (((this.f6595t == null ? 0 : this.f6595t.hashCode()) + (((this.f6594s == null ? 0 : this.f6594s.hashCode()) + (((this.f6593r == null ? 0 : this.f6593r.hashCode()) + (((this.f6592q == null ? 0 : this.f6592q.hashCode()) + (((this.f6591p == null ? 0 : this.f6591p.hashCode()) + (((this.f6590o == null ? 0 : this.f6590o.hashCode()) + (((this.f6589n == null ? 0 : this.f6589n.hashCode()) + (((this.f6588m == null ? 0 : this.f6588m.hashCode()) + (((this.f6587l == null ? 0 : this.f6587l.hashCode()) + (((this.f6586k == null ? 0 : this.f6586k.hashCode()) + (((this.f6585j == null ? 0 : this.f6585j.hashCode()) + (((this.f6584i == null ? 0 : this.f6584i.hashCode()) + (((this.f6583h == null ? 0 : this.f6583h.hashCode()) + (((this.f6582g == null ? 0 : this.f6582g.hashCode()) + (((this.f6581f == null ? 0 : this.f6581f.hashCode()) + (((this.f6580e == null ? 0 : this.f6580e.hashCode()) + (((this.f6579d == null ? 0 : this.f6579d.hashCode()) + (((((((this.f6576a == null ? 0 : this.f6576a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + bsa.m10154a(this.f6577b)) * 31) + bsa.m10154a(this.f6578c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + bsa.m10154a(this.f6567A)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
