package com.google.android.gms.internal;

import com.google.android.gms.internal.auu;
import com.google.android.gms.internal.ave;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auy extends boz<auy, C1396a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final auy f7333g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<auy> f7334h;

    /* JADX INFO: renamed from: d */
    private ave f7335d;

    /* JADX INFO: renamed from: e */
    private auu f7336e;

    /* JADX INFO: renamed from: f */
    private int f7337f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auy$a */
    public static final class C1396a extends boz.AbstractC1441a<auy, C1396a> implements bqc {
        private C1396a() {
            super(auy.f7333g);
        }

        /* synthetic */ C1396a(auz auzVar) {
            this();
        }
    }

    static {
        auy auyVar = new auy();
        f7333g = auyVar;
        auyVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        auyVar.f8560b.m10032c();
    }

    private auy() {
    }

    /* JADX INFO: renamed from: e */
    public static auy m8437e() {
        return f7333g;
    }

    /* JADX INFO: renamed from: a */
    public final ave m8439a() {
        return this.f7335d == null ? ave.m8477e() : this.f7335d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auu.C1394a c1394a;
        ave.C1400a c1400a;
        auz auzVar = null;
        switch (auz.f7338a[i - 1]) {
            case 1:
                return new auy();
            case 2:
                return f7333g;
            case 3:
                return null;
            case 4:
                return new C1396a(auzVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                auy auyVar = (auy) obj2;
                this.f7335d = (ave) interfaceC1448h.mo9917a(this.f7335d, auyVar.f7335d);
                this.f7336e = (auu) interfaceC1448h.mo9917a(this.f7336e, auyVar.f7336e);
                this.f7337f = interfaceC1448h.mo9914a(this.f7337f != 0, this.f7337f, auyVar.f7337f != 0, auyVar.f7337f);
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
                                if (this.f7335d != null) {
                                    ave aveVar = this.f7335d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aveVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(aveVar);
                                    c1400a = (ave.C1400a) abstractC1441a;
                                } else {
                                    c1400a = null;
                                }
                                this.f7335d = (ave) bokVar.mo9782a(ave.m8477e(), borVar);
                                if (c1400a != null) {
                                    c1400a.mo9750a(this.f7335d);
                                    this.f7335d = (ave) c1400a.m9911c();
                                }
                                break;
                            case 18:
                                if (this.f7336e != null) {
                                    auu auuVar = this.f7336e;
                                    boz.AbstractC1441a abstractC1441a2 = (boz.AbstractC1441a) auuVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a2.mo9750a(auuVar);
                                    c1394a = (auu.C1394a) abstractC1441a2;
                                } else {
                                    c1394a = null;
                                }
                                this.f7336e = (auu) bokVar.mo9782a(auu.m8431b(), borVar);
                                if (c1394a != null) {
                                    c1394a.mo9750a(this.f7336e);
                                    this.f7336e = (auu) c1394a.m9911c();
                                }
                                break;
                            case 24:
                                this.f7337f = bokVar.mo9793i();
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
                if (f7334h == null) {
                    synchronized (auy.class) {
                        if (f7334h == null) {
                            f7334h = new boz.C1442b(f7333g);
                        }
                        break;
                    }
                }
                return f7334h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7333g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7335d != null) {
            bonVar.mo9849a(1, this.f7335d == null ? ave.m8477e() : this.f7335d);
        }
        if (this.f7336e != null) {
            bonVar.mo9849a(2, this.f7336e == null ? auu.m8431b() : this.f7336e);
        }
        if (this.f7337f != aus.UNKNOWN_FORMAT.mo8430a()) {
            bonVar.mo9859b(3, this.f7337f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final auu m8440b() {
        return this.f7336e == null ? auu.m8431b() : this.f7336e;
    }

    /* JADX INFO: renamed from: c */
    public final aus m8441c() {
        aus ausVarM8429a = aus.m8429a(this.f7337f);
        return ausVarM8429a == null ? aus.UNRECOGNIZED : ausVarM8429a;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9835g = 0;
        if (this.f7335d != null) {
            iM9835g = bon.m9819c(1, this.f7335d == null ? ave.m8477e() : this.f7335d) + 0;
        }
        if (this.f7336e != null) {
            iM9835g += bon.m9819c(2, this.f7336e == null ? auu.m8431b() : this.f7336e);
        }
        if (this.f7337f != aus.UNKNOWN_FORMAT.mo8430a()) {
            iM9835g += bon.m9835g(3, this.f7337f);
        }
        int iM10034e = iM9835g + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
