package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aeq extends brw<aeq> {

    /* JADX INFO: renamed from: a */
    public Integer f6529a = null;

    /* JADX INFO: renamed from: b */
    public String f6530b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f6531c = null;

    /* JADX INFO: renamed from: d */
    public String[] f6532d = bsf.f8821f;

    public aeq() {
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
    public final aeq mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 8:
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
                                this.f6529a = Integer.valueOf(iM10096g);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(41).append(iM10096g).append(" is not a valid enum MatchType").toString());
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
                    this.f6530b = brtVar.m10093e();
                    break;
                case 24:
                    this.f6531c = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 34:
                    int iM10172a = bsf.m10172a(brtVar, 34);
                    int length = this.f6532d == null ? 0 : this.f6532d.length;
                    String[] strArr = new String[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f6532d, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = brtVar.m10093e();
                        brtVar.m10082a();
                        length++;
                    }
                    strArr[length] = brtVar.m10093e();
                    this.f6532d = strArr;
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
        if (this.f6529a != null) {
            iMo7775a += bru.m10111b(1, this.f6529a.intValue());
        }
        if (this.f6530b != null) {
            iMo7775a += bru.m10113b(2, this.f6530b);
        }
        if (this.f6531c != null) {
            this.f6531c.booleanValue();
            iMo7775a += bru.m10110b(3) + 1;
        }
        if (this.f6532d == null || this.f6532d.length <= 0) {
            return iMo7775a;
        }
        int iM10106a = 0;
        int i = 0;
        for (int i2 = 0; i2 < this.f6532d.length; i2++) {
            String str = this.f6532d[i2];
            if (str != null) {
                i++;
                iM10106a += bru.m10106a(str);
            }
        }
        return iMo7775a + iM10106a + (i * 1);
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f6529a != null) {
            bruVar.m10125a(1, this.f6529a.intValue());
        }
        if (this.f6530b != null) {
            bruVar.m10128a(2, this.f6530b);
        }
        if (this.f6531c != null) {
            bruVar.m10129a(3, this.f6531c.booleanValue());
        }
        if (this.f6532d != null && this.f6532d.length > 0) {
            for (int i = 0; i < this.f6532d.length; i++) {
                String str = this.f6532d[i];
                if (str != null) {
                    bruVar.m10128a(4, str);
                }
            }
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeq)) {
            return false;
        }
        aeq aeqVar = (aeq) obj;
        if (this.f6529a == null) {
            if (aeqVar.f6529a != null) {
                return false;
            }
        } else if (!this.f6529a.equals(aeqVar.f6529a)) {
            return false;
        }
        if (this.f6530b == null) {
            if (aeqVar.f6530b != null) {
                return false;
            }
        } else if (!this.f6530b.equals(aeqVar.f6530b)) {
            return false;
        }
        if (this.f6531c == null) {
            if (aeqVar.f6531c != null) {
                return false;
            }
        } else if (!this.f6531c.equals(aeqVar.f6531c)) {
            return false;
        }
        if (bsa.m10157a(this.f6532d, aeqVar.f6532d)) {
            return (this.f8769X == null || this.f8769X.m10147b()) ? aeqVar.f8769X == null || aeqVar.f8769X.m10147b() : this.f8769X.equals(aeqVar.f8769X);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((((this.f6531c == null ? 0 : this.f6531c.hashCode()) + (((this.f6530b == null ? 0 : this.f6530b.hashCode()) + (((this.f6529a == null ? 0 : this.f6529a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31) + bsa.m10154a(this.f6532d)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
