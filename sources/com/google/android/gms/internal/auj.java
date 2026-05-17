package com.google.android.gms.internal;

import com.google.android.gms.internal.aun;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auj extends boz<auj, C1390a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final auj f7296g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<auj> f7297h;

    /* JADX INFO: renamed from: d */
    private int f7298d;

    /* JADX INFO: renamed from: e */
    private aun f7299e;

    /* JADX INFO: renamed from: f */
    private bob f7300f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auj$a */
    public static final class C1390a extends boz.AbstractC1441a<auj, C1390a> implements bqc {
        private C1390a() {
            super(auj.f7296g);
        }

        /* synthetic */ C1390a(auk aukVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1390a m8409a(int i) {
            m9910b();
            ((auj) this.f8562a).m8399a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1390a m8410a(aun aunVar) {
            m9910b();
            ((auj) this.f8562a).m8403a(aunVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1390a m8411a(bob bobVar) {
            m9910b();
            ((auj) this.f8562a).m8404b(bobVar);
            return this;
        }
    }

    static {
        auj aujVar = new auj();
        f7296g = aujVar;
        aujVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aujVar.f8560b.m10032c();
    }

    private auj() {
    }

    /* JADX INFO: renamed from: a */
    public static auj m8398a(bob bobVar) {
        return (auj) boz.m9898a(f7296g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8399a(int i) {
        this.f7298d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8403a(aun aunVar) {
        if (aunVar == null) {
            throw new NullPointerException();
        }
        this.f7299e = aunVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8404b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7300f = bobVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1390a m8405c() {
        auj aujVar = f7296g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aujVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(aujVar);
        return (C1390a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8407a() {
        return this.f7298d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        aun.C1392a c1392a;
        auk aukVar = null;
        switch (auk.f7301a[i - 1]) {
            case 1:
                return new auj();
            case 2:
                return f7296g;
            case 3:
                return null;
            case 4:
                return new C1390a(aukVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                auj aujVar = (auj) obj2;
                this.f7298d = interfaceC1448h.mo9914a(this.f7298d != 0, this.f7298d, aujVar.f7298d != 0, aujVar.f7298d);
                this.f7299e = (aun) interfaceC1448h.mo9917a(this.f7299e, aujVar.f7299e);
                this.f7300f = interfaceC1448h.mo9915a(this.f7300f != bob.f8512a, this.f7300f, aujVar.f7300f != bob.f8512a, aujVar.f7300f);
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
                                this.f7298d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7299e != null) {
                                    aun aunVar = this.f7299e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aunVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(aunVar);
                                    c1392a = (aun.C1392a) abstractC1441a;
                                } else {
                                    c1392a = null;
                                }
                                this.f7299e = (aun) bokVar.mo9782a(aun.m8416a(), borVar);
                                if (c1392a != null) {
                                    c1392a.mo9750a(this.f7299e);
                                    this.f7299e = (aun) c1392a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7300f = bokVar.mo9791g();
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
                if (f7297h == null) {
                    synchronized (auj.class) {
                        if (f7297h == null) {
                            f7297h = new boz.C1442b(f7296g);
                        }
                        break;
                    }
                }
                return f7297h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7296g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7298d != 0) {
            bonVar.mo9865c(1, this.f7298d);
        }
        if (this.f7299e != null) {
            bonVar.mo9849a(2, this.f7299e == null ? aun.m8416a() : this.f7299e);
        }
        if (!this.f7300f.m9769b()) {
            bonVar.mo9848a(3, this.f7300f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final bob m8408b() {
        return this.f7300f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7298d != 0 ? bon.m9829e(1, this.f7298d) + 0 : 0;
        if (this.f7299e != null) {
            iM9829e += bon.m9819c(2, this.f7299e == null ? aun.m8416a() : this.f7299e);
        }
        if (!this.f7300f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7300f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
