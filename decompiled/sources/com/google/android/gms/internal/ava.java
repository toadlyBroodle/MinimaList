package com.google.android.gms.internal;

import com.google.android.gms.internal.avc;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ava extends boz<ava, C1398a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final ava f7340g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<ava> f7341h;

    /* JADX INFO: renamed from: d */
    private int f7342d;

    /* JADX INFO: renamed from: e */
    private avc f7343e;

    /* JADX INFO: renamed from: f */
    private bob f7344f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ava$a */
    public static final class C1398a extends boz.AbstractC1441a<ava, C1398a> implements bqc {
        private C1398a() {
            super(ava.f7340g);
        }

        /* synthetic */ C1398a(avb avbVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1398a m8454a(int i) {
            m9910b();
            ((ava) this.f8562a).m8443a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1398a m8455a(avc avcVar) {
            m9910b();
            ((ava) this.f8562a).m8447a(avcVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1398a m8456a(bob bobVar) {
            m9910b();
            ((ava) this.f8562a).m8448b(bobVar);
            return this;
        }
    }

    static {
        ava avaVar = new ava();
        f7340g = avaVar;
        avaVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avaVar.f8560b.m10032c();
    }

    private ava() {
    }

    /* JADX INFO: renamed from: a */
    public static ava m8442a(bob bobVar) {
        return (ava) boz.m9898a(f7340g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8443a(int i) {
        this.f7342d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8447a(avc avcVar) {
        if (avcVar == null) {
            throw new NullPointerException();
        }
        this.f7343e = avcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8448b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7344f = bobVar;
    }

    /* JADX INFO: renamed from: e */
    public static C1398a m8449e() {
        ava avaVar = f7340g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avaVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(avaVar);
        return (C1398a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8451a() {
        return this.f7342d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avc.C1399a c1399a;
        avb avbVar = null;
        switch (avb.f7345a[i - 1]) {
            case 1:
                return new ava();
            case 2:
                return f7340g;
            case 3:
                return null;
            case 4:
                return new C1398a(avbVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                ava avaVar = (ava) obj2;
                this.f7342d = interfaceC1448h.mo9914a(this.f7342d != 0, this.f7342d, avaVar.f7342d != 0, avaVar.f7342d);
                this.f7343e = (avc) interfaceC1448h.mo9917a(this.f7343e, avaVar.f7343e);
                this.f7344f = interfaceC1448h.mo9915a(this.f7344f != bob.f8512a, this.f7344f, avaVar.f7344f != bob.f8512a, avaVar.f7344f);
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
                                this.f7342d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7343e != null) {
                                    avc avcVar = this.f7343e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avcVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(avcVar);
                                    c1399a = (avc.C1399a) abstractC1441a;
                                } else {
                                    c1399a = null;
                                }
                                this.f7343e = (avc) bokVar.mo9782a(avc.m8467g(), borVar);
                                if (c1399a != null) {
                                    c1399a.mo9750a(this.f7343e);
                                    this.f7343e = (avc) c1399a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7344f = bokVar.mo9791g();
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
                if (f7341h == null) {
                    synchronized (ava.class) {
                        if (f7341h == null) {
                            f7341h = new boz.C1442b(f7340g);
                        }
                        break;
                    }
                }
                return f7341h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7340g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7342d != 0) {
            bonVar.mo9865c(1, this.f7342d);
        }
        if (this.f7343e != null) {
            bonVar.mo9849a(2, this.f7343e == null ? avc.m8467g() : this.f7343e);
        }
        if (!this.f7344f.m9769b()) {
            bonVar.mo9848a(3, this.f7344f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final avc m8452b() {
        return this.f7343e == null ? avc.m8467g() : this.f7343e;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8453c() {
        return this.f7344f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7342d != 0 ? bon.m9829e(1, this.f7342d) + 0 : 0;
        if (this.f7343e != null) {
            iM9829e += bon.m9819c(2, this.f7343e == null ? avc.m8467g() : this.f7343e);
        }
        if (!this.f7344f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7344f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
