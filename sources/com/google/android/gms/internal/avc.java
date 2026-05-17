package com.google.android.gms.internal;

import com.google.android.gms.internal.auy;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avc extends boz<avc, C1399a> implements bqc {

    /* JADX INFO: renamed from: h */
    private static final avc f7346h;

    /* JADX INFO: renamed from: i */
    private static volatile bqg<avc> f7347i;

    /* JADX INFO: renamed from: d */
    private int f7348d;

    /* JADX INFO: renamed from: e */
    private auy f7349e;

    /* JADX INFO: renamed from: f */
    private bob f7350f = bob.f8512a;

    /* JADX INFO: renamed from: g */
    private bob f7351g = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avc$a */
    public static final class C1399a extends boz.AbstractC1441a<avc, C1399a> implements bqc {
        private C1399a() {
            super(avc.f7346h);
        }

        /* synthetic */ C1399a(avd avdVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1399a m8473a(int i) {
            m9910b();
            ((avc) this.f8562a).m8458a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1399a m8474a(auy auyVar) {
            m9910b();
            ((avc) this.f8562a).m8459a(auyVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1399a m8475a(bob bobVar) {
            m9910b();
            ((avc) this.f8562a).m8464b(bobVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C1399a m8476b(bob bobVar) {
            m9910b();
            ((avc) this.f8562a).m8465c(bobVar);
            return this;
        }
    }

    static {
        avc avcVar = new avc();
        f7346h = avcVar;
        avcVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avcVar.f8560b.m10032c();
    }

    private avc() {
    }

    /* JADX INFO: renamed from: a */
    public static avc m8457a(bob bobVar) {
        return (avc) boz.m9898a(f7346h, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8458a(int i) {
        this.f7348d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8459a(auy auyVar) {
        if (auyVar == null) {
            throw new NullPointerException();
        }
        this.f7349e = auyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8464b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7350f = bobVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m8465c(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7351g = bobVar;
    }

    /* JADX INFO: renamed from: f */
    public static C1399a m8466f() {
        avc avcVar = f7346h;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avcVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(avcVar);
        return (C1399a) abstractC1441a;
    }

    /* JADX INFO: renamed from: g */
    public static avc m8467g() {
        return f7346h;
    }

    /* JADX INFO: renamed from: a */
    public final int m8469a() {
        return this.f7348d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auy.C1396a c1396a;
        avd avdVar = null;
        switch (avd.f7352a[i - 1]) {
            case 1:
                return new avc();
            case 2:
                return f7346h;
            case 3:
                return null;
            case 4:
                return new C1399a(avdVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avc avcVar = (avc) obj2;
                this.f7348d = interfaceC1448h.mo9914a(this.f7348d != 0, this.f7348d, avcVar.f7348d != 0, avcVar.f7348d);
                this.f7349e = (auy) interfaceC1448h.mo9917a(this.f7349e, avcVar.f7349e);
                this.f7350f = interfaceC1448h.mo9915a(this.f7350f != bob.f8512a, this.f7350f, avcVar.f7350f != bob.f8512a, avcVar.f7350f);
                this.f7351g = interfaceC1448h.mo9915a(this.f7351g != bob.f8512a, this.f7351g, avcVar.f7351g != bob.f8512a, avcVar.f7351g);
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
                            case 8:
                                this.f7348d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7349e != null) {
                                    auy auyVar = this.f7349e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) auyVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(auyVar);
                                    c1396a = (auy.C1396a) abstractC1441a;
                                } else {
                                    c1396a = null;
                                }
                                this.f7349e = (auy) bokVar.mo9782a(auy.m8437e(), borVar);
                                if (c1396a != null) {
                                    c1396a.mo9750a(this.f7349e);
                                    this.f7349e = (auy) c1396a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7350f = bokVar.mo9791g();
                                break;
                            case 34:
                                this.f7351g = bokVar.mo9791g();
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
                if (f7347i == null) {
                    synchronized (avc.class) {
                        if (f7347i == null) {
                            f7347i = new boz.C1442b(f7346h);
                        }
                        break;
                    }
                }
                return f7347i;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7346h;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7348d != 0) {
            bonVar.mo9865c(1, this.f7348d);
        }
        if (this.f7349e != null) {
            bonVar.mo9849a(2, this.f7349e == null ? auy.m8437e() : this.f7349e);
        }
        if (!this.f7350f.m9769b()) {
            bonVar.mo9848a(3, this.f7350f);
        }
        if (!this.f7351g.m9769b()) {
            bonVar.mo9848a(4, this.f7351g);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final auy m8470b() {
        return this.f7349e == null ? auy.m8437e() : this.f7349e;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8471c() {
        return this.f7350f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7348d != 0 ? bon.m9829e(1, this.f7348d) + 0 : 0;
        if (this.f7349e != null) {
            iM9829e += bon.m9819c(2, this.f7349e == null ? auy.m8437e() : this.f7349e);
        }
        if (!this.f7350f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7350f);
        }
        if (!this.f7351g.m9769b()) {
            iM9829e += bon.m9818c(4, this.f7351g);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }

    /* JADX INFO: renamed from: e */
    public final bob m8472e() {
        return this.f7351g;
    }
}
