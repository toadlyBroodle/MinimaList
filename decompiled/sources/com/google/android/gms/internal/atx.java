package com.google.android.gms.internal;

import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class atx extends boz<atx, C1383a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final atx f7265g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<atx> f7266h;

    /* JADX INFO: renamed from: d */
    private int f7267d;

    /* JADX INFO: renamed from: e */
    private aub f7268e;

    /* JADX INFO: renamed from: f */
    private bob f7269f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.atx$a */
    public static final class C1383a extends boz.AbstractC1441a<atx, C1383a> implements bqc {
        private C1383a() {
            super(atx.f7265g);
        }

        /* synthetic */ C1383a(aty atyVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1383a m8365a(int i) {
            m9910b();
            ((atx) this.f8562a).m8353a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1383a m8366a(aub aubVar) {
            m9910b();
            ((atx) this.f8562a).m8357a(aubVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1383a m8367a(bob bobVar) {
            m9910b();
            ((atx) this.f8562a).m8358b(bobVar);
            return this;
        }
    }

    static {
        atx atxVar = new atx();
        f7265g = atxVar;
        atxVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        atxVar.f8560b.m10032c();
    }

    private atx() {
    }

    /* JADX INFO: renamed from: a */
    public static atx m8352a(bob bobVar) {
        return (atx) boz.m9898a(f7265g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8353a(int i) {
        this.f7267d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8357a(aub aubVar) {
        if (aubVar == null) {
            throw new NullPointerException();
        }
        this.f7268e = aubVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8358b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7269f = bobVar;
    }

    /* JADX INFO: renamed from: e */
    public static C1383a m8359e() {
        atx atxVar = f7265g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) atxVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(atxVar);
        return (C1383a) abstractC1441a;
    }

    /* JADX INFO: renamed from: f */
    public static atx m8360f() {
        return f7265g;
    }

    /* JADX INFO: renamed from: a */
    public final int m8362a() {
        return this.f7267d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        aub.C1386a c1386a;
        aty atyVar = null;
        switch (aty.f7270a[i - 1]) {
            case 1:
                return new atx();
            case 2:
                return f7265g;
            case 3:
                return null;
            case 4:
                return new C1383a(atyVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                atx atxVar = (atx) obj2;
                this.f7267d = interfaceC1448h.mo9914a(this.f7267d != 0, this.f7267d, atxVar.f7267d != 0, atxVar.f7267d);
                this.f7268e = (aub) interfaceC1448h.mo9917a(this.f7268e, atxVar.f7268e);
                this.f7269f = interfaceC1448h.mo9915a(this.f7269f != bob.f8512a, this.f7269f, atxVar.f7269f != bob.f8512a, atxVar.f7269f);
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
                                this.f7267d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7268e != null) {
                                    aub aubVar = this.f7268e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aubVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(aubVar);
                                    c1386a = (aub.C1386a) abstractC1441a;
                                } else {
                                    c1386a = null;
                                }
                                this.f7268e = (aub) bokVar.mo9782a(aub.m8373b(), borVar);
                                if (c1386a != null) {
                                    c1386a.mo9750a(this.f7268e);
                                    this.f7268e = (aub) c1386a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7269f = bokVar.mo9791g();
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
                if (f7266h == null) {
                    synchronized (atx.class) {
                        if (f7266h == null) {
                            f7266h = new boz.C1442b(f7265g);
                        }
                        break;
                    }
                }
                return f7266h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7265g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7267d != 0) {
            bonVar.mo9865c(1, this.f7267d);
        }
        if (this.f7268e != null) {
            bonVar.mo9849a(2, this.f7268e == null ? aub.m8373b() : this.f7268e);
        }
        if (!this.f7269f.m9769b()) {
            bonVar.mo9848a(3, this.f7269f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final aub m8363b() {
        return this.f7268e == null ? aub.m8373b() : this.f7268e;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8364c() {
        return this.f7269f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7267d != 0 ? bon.m9829e(1, this.f7267d) + 0 : 0;
        if (this.f7268e != null) {
            iM9829e += bon.m9819c(2, this.f7268e == null ? aub.m8373b() : this.f7268e);
        }
        if (!this.f7269f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7269f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
