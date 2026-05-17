package com.google.android.gms.internal;

import com.google.android.gms.internal.auh;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aud extends boz<aud, C1387a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final aud f7281g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<aud> f7282h;

    /* JADX INFO: renamed from: d */
    private int f7283d;

    /* JADX INFO: renamed from: e */
    private auh f7284e;

    /* JADX INFO: renamed from: f */
    private bob f7285f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aud$a */
    public static final class C1387a extends boz.AbstractC1441a<aud, C1387a> implements bqc {
        private C1387a() {
            super(aud.f7281g);
        }

        /* synthetic */ C1387a(aue aueVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1387a m8388a(int i) {
            m9910b();
            ((aud) this.f8562a).m8377a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1387a m8389a(auh auhVar) {
            m9910b();
            ((aud) this.f8562a).m8381a(auhVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1387a m8390a(bob bobVar) {
            m9910b();
            ((aud) this.f8562a).m8382b(bobVar);
            return this;
        }
    }

    static {
        aud audVar = new aud();
        f7281g = audVar;
        audVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        audVar.f8560b.m10032c();
    }

    private aud() {
    }

    /* JADX INFO: renamed from: a */
    public static aud m8376a(bob bobVar) {
        return (aud) boz.m9898a(f7281g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8377a(int i) {
        this.f7283d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8381a(auh auhVar) {
        if (auhVar == null) {
            throw new NullPointerException();
        }
        this.f7284e = auhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8382b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7285f = bobVar;
    }

    /* JADX INFO: renamed from: e */
    public static C1387a m8383e() {
        aud audVar = f7281g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) audVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(audVar);
        return (C1387a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8385a() {
        return this.f7283d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auh.C1389a c1389a;
        aue aueVar = null;
        switch (aue.f7286a[i - 1]) {
            case 1:
                return new aud();
            case 2:
                return f7281g;
            case 3:
                return null;
            case 4:
                return new C1387a(aueVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                aud audVar = (aud) obj2;
                this.f7283d = interfaceC1448h.mo9914a(this.f7283d != 0, this.f7283d, audVar.f7283d != 0, audVar.f7283d);
                this.f7284e = (auh) interfaceC1448h.mo9917a(this.f7284e, audVar.f7284e);
                this.f7285f = interfaceC1448h.mo9915a(this.f7285f != bob.f8512a, this.f7285f, audVar.f7285f != bob.f8512a, audVar.f7285f);
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
                                this.f7283d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7284e != null) {
                                    auh auhVar = this.f7284e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) auhVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(auhVar);
                                    c1389a = (auh.C1389a) abstractC1441a;
                                } else {
                                    c1389a = null;
                                }
                                this.f7284e = (auh) bokVar.mo9782a(auh.m8395b(), borVar);
                                if (c1389a != null) {
                                    c1389a.mo9750a(this.f7284e);
                                    this.f7284e = (auh) c1389a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7285f = bokVar.mo9791g();
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
                if (f7282h == null) {
                    synchronized (aud.class) {
                        if (f7282h == null) {
                            f7282h = new boz.C1442b(f7281g);
                        }
                        break;
                    }
                }
                return f7282h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7281g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7283d != 0) {
            bonVar.mo9865c(1, this.f7283d);
        }
        if (this.f7284e != null) {
            bonVar.mo9849a(2, this.f7284e == null ? auh.m8395b() : this.f7284e);
        }
        if (!this.f7285f.m9769b()) {
            bonVar.mo9848a(3, this.f7285f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final auh m8386b() {
        return this.f7284e == null ? auh.m8395b() : this.f7284e;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8387c() {
        return this.f7285f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7283d != 0 ? bon.m9829e(1, this.f7283d) + 0 : 0;
        if (this.f7284e != null) {
            iM9829e += bon.m9819c(2, this.f7284e == null ? auh.m8395b() : this.f7284e);
        }
        if (!this.f7285f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7285f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
