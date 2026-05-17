package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aeo extends brw<aeo> {

    /* JADX INFO: renamed from: a */
    public Integer f6520a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f6521b = null;

    /* JADX INFO: renamed from: c */
    public String f6522c = null;

    /* JADX INFO: renamed from: d */
    public String f6523d = null;

    /* JADX INFO: renamed from: e */
    public String f6524e = null;

    public aeo() {
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
    public final aeo mo7776a(brt brtVar) throws bsb {
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
                                this.f6520a = Integer.valueOf(iM10096g);
                                continue;
                            default:
                                throw new IllegalArgumentException(new StringBuilder(46).append(iM10096g).append(" is not a valid enum ComparisonType").toString());
                        }
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                        break;
                    }
                    brtVar.m10094e(iM10101l);
                    m10136a(brtVar, iM10082a);
                    break;
                case 16:
                    this.f6521b = Boolean.valueOf(brtVar.m10092d());
                    break;
                case 26:
                    this.f6522c = brtVar.m10093e();
                    break;
                case 34:
                    this.f6523d = brtVar.m10093e();
                    break;
                case 42:
                    this.f6524e = brtVar.m10093e();
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
        if (this.f6520a != null) {
            iMo7775a += bru.m10111b(1, this.f6520a.intValue());
        }
        if (this.f6521b != null) {
            this.f6521b.booleanValue();
            iMo7775a += bru.m10110b(2) + 1;
        }
        if (this.f6522c != null) {
            iMo7775a += bru.m10113b(3, this.f6522c);
        }
        if (this.f6523d != null) {
            iMo7775a += bru.m10113b(4, this.f6523d);
        }
        return this.f6524e != null ? iMo7775a + bru.m10113b(5, this.f6524e) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f6520a != null) {
            bruVar.m10125a(1, this.f6520a.intValue());
        }
        if (this.f6521b != null) {
            bruVar.m10129a(2, this.f6521b.booleanValue());
        }
        if (this.f6522c != null) {
            bruVar.m10128a(3, this.f6522c);
        }
        if (this.f6523d != null) {
            bruVar.m10128a(4, this.f6523d);
        }
        if (this.f6524e != null) {
            bruVar.m10128a(5, this.f6524e);
        }
        super.mo7777a(bruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeo)) {
            return false;
        }
        aeo aeoVar = (aeo) obj;
        if (this.f6520a == null) {
            if (aeoVar.f6520a != null) {
                return false;
            }
        } else if (!this.f6520a.equals(aeoVar.f6520a)) {
            return false;
        }
        if (this.f6521b == null) {
            if (aeoVar.f6521b != null) {
                return false;
            }
        } else if (!this.f6521b.equals(aeoVar.f6521b)) {
            return false;
        }
        if (this.f6522c == null) {
            if (aeoVar.f6522c != null) {
                return false;
            }
        } else if (!this.f6522c.equals(aeoVar.f6522c)) {
            return false;
        }
        if (this.f6523d == null) {
            if (aeoVar.f6523d != null) {
                return false;
            }
        } else if (!this.f6523d.equals(aeoVar.f6523d)) {
            return false;
        }
        if (this.f6524e == null) {
            if (aeoVar.f6524e != null) {
                return false;
            }
        } else if (!this.f6524e.equals(aeoVar.f6524e)) {
            return false;
        }
        return (this.f8769X == null || this.f8769X.m10147b()) ? aeoVar.f8769X == null || aeoVar.f8769X.m10147b() : this.f8769X.equals(aeoVar.f8769X);
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((this.f6524e == null ? 0 : this.f6524e.hashCode()) + (((this.f6523d == null ? 0 : this.f6523d.hashCode()) + (((this.f6522c == null ? 0 : this.f6522c.hashCode()) + (((this.f6521b == null ? 0 : this.f6521b.hashCode()) + (((this.f6520a == null ? 0 : this.f6520a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f8769X != null && !this.f8769X.m10147b()) {
            iHashCode = this.f8769X.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
