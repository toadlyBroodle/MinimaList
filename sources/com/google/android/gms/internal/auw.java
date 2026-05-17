package com.google.android.gms.internal;

import com.google.android.gms.internal.auy;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auw extends boz<auw, C1395a> implements bqc {

    /* JADX INFO: renamed from: e */
    private static final auw f7329e;

    /* JADX INFO: renamed from: f */
    private static volatile bqg<auw> f7330f;

    /* JADX INFO: renamed from: d */
    private auy f7331d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auw$a */
    public static final class C1395a extends boz.AbstractC1441a<auw, C1395a> implements bqc {
        private C1395a() {
            super(auw.f7329e);
        }

        /* synthetic */ C1395a(aux auxVar) {
            this();
        }
    }

    static {
        auw auwVar = new auw();
        f7329e = auwVar;
        auwVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        auwVar.f8560b.m10032c();
    }

    private auw() {
    }

    /* JADX INFO: renamed from: a */
    public static auw m8434a(bob bobVar) {
        return (auw) boz.m9898a(f7329e, bobVar);
    }

    /* JADX INFO: renamed from: a */
    public final auy m8436a() {
        return this.f7331d == null ? auy.m8437e() : this.f7331d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auy.C1396a c1396a;
        aux auxVar = null;
        switch (aux.f7332a[i - 1]) {
            case 1:
                return new auw();
            case 2:
                return f7329e;
            case 3:
                return null;
            case 4:
                return new C1395a(auxVar);
            case 5:
                this.f7331d = (auy) ((boz.InterfaceC1448h) obj).mo9917a(this.f7331d, ((auw) obj2).f7331d);
                return this;
            case 6:
                bok bokVar = (bok) obj;
                bor borVar = (bor) obj2;
                if (borVar == null) {
                    throw new NullPointerException();
                }
                boolean z = false;
                while (!z) {
                    try {
                        int iMo9781a = bokVar.mo9781a();
                        switch (iMo9781a) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                if (this.f7331d != null) {
                                    auy auyVar = this.f7331d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) auyVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(auyVar);
                                    c1396a = (auy.C1396a) abstractC1441a;
                                } else {
                                    c1396a = null;
                                }
                                this.f7331d = (auy) bokVar.mo9782a(auy.m8437e(), borVar);
                                if (c1396a != null) {
                                    c1396a.mo9750a(this.f7331d);
                                    this.f7331d = (auy) c1396a.m9911c();
                                }
                                break;
                            default:
                                if (!m9905a(iMo9781a, bokVar)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (bpf e) {
                        throw new RuntimeException(e.m9943a(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new bpf(e2.getMessage()).m9943a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f7330f == null) {
                    synchronized (auw.class) {
                        if (f7330f == null) {
                            f7330f = new boz.C1442b(f7329e);
                        }
                        break;
                    }
                }
                return f7330f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7329e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7331d != null) {
            bonVar.mo9849a(1, this.f7331d == null ? auy.m8437e() : this.f7331d);
        }
        this.f8560b.m10028a(bonVar);
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9819c = 0;
        if (this.f7331d != null) {
            iM9819c = bon.m9819c(1, this.f7331d == null ? auy.m8437e() : this.f7331d) + 0;
        }
        int iM10034e = iM9819c + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
