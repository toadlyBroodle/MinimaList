package com.google.android.gms.internal;

import com.google.android.gms.internal.avo;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avk extends boz<avk, C1401a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final avk f7377g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<avk> f7378h;

    /* JADX INFO: renamed from: d */
    private int f7379d;

    /* JADX INFO: renamed from: e */
    private avo f7380e;

    /* JADX INFO: renamed from: f */
    private bob f7381f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avk$a */
    public static final class C1401a extends boz.AbstractC1441a<avk, C1401a> implements bqc {
        private C1401a() {
            super(avk.f7377g);
        }

        /* synthetic */ C1401a(avl avlVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1401a m8497a(int i) {
            m9910b();
            ((avk) this.f8562a).m8485a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1401a m8498a(avo avoVar) {
            m9910b();
            ((avk) this.f8562a).m8489a(avoVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1401a m8499a(bob bobVar) {
            m9910b();
            ((avk) this.f8562a).m8490b(bobVar);
            return this;
        }
    }

    static {
        avk avkVar = new avk();
        f7377g = avkVar;
        avkVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avkVar.f8560b.m10032c();
    }

    private avk() {
    }

    /* JADX INFO: renamed from: a */
    public static avk m8484a(bob bobVar) {
        return (avk) boz.m9898a(f7377g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8485a(int i) {
        this.f7379d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8489a(avo avoVar) {
        if (avoVar == null) {
            throw new NullPointerException();
        }
        this.f7380e = avoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8490b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7381f = bobVar;
    }

    /* JADX INFO: renamed from: e */
    public static C1401a m8491e() {
        avk avkVar = f7377g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avkVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(avkVar);
        return (C1401a) abstractC1441a;
    }

    /* JADX INFO: renamed from: f */
    public static avk m8492f() {
        return f7377g;
    }

    /* JADX INFO: renamed from: a */
    public final int m8494a() {
        return this.f7379d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avo.C1403a c1403a;
        avl avlVar = null;
        switch (avl.f7382a[i - 1]) {
            case 1:
                return new avk();
            case 2:
                return f7377g;
            case 3:
                return null;
            case 4:
                return new C1401a(avlVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avk avkVar = (avk) obj2;
                this.f7379d = interfaceC1448h.mo9914a(this.f7379d != 0, this.f7379d, avkVar.f7379d != 0, avkVar.f7379d);
                this.f7380e = (avo) interfaceC1448h.mo9917a(this.f7380e, avkVar.f7380e);
                this.f7381f = interfaceC1448h.mo9915a(this.f7381f != bob.f8512a, this.f7381f, avkVar.f7381f != bob.f8512a, avkVar.f7381f);
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
                                this.f7379d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7380e != null) {
                                    avo avoVar = this.f7380e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avoVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(avoVar);
                                    c1403a = (avo.C1403a) abstractC1441a;
                                } else {
                                    c1403a = null;
                                }
                                this.f7380e = (avo) bokVar.mo9782a(avo.m8505c(), borVar);
                                if (c1403a != null) {
                                    c1403a.mo9750a(this.f7380e);
                                    this.f7380e = (avo) c1403a.m9911c();
                                }
                                break;
                            case 26:
                                this.f7381f = bokVar.mo9791g();
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
                if (f7378h == null) {
                    synchronized (avk.class) {
                        if (f7378h == null) {
                            f7378h = new boz.C1442b(f7377g);
                        }
                        break;
                    }
                }
                return f7378h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7377g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7379d != 0) {
            bonVar.mo9865c(1, this.f7379d);
        }
        if (this.f7380e != null) {
            bonVar.mo9849a(2, this.f7380e == null ? avo.m8505c() : this.f7380e);
        }
        if (!this.f7381f.m9769b()) {
            bonVar.mo9848a(3, this.f7381f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final avo m8495b() {
        return this.f7380e == null ? avo.m8505c() : this.f7380e;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8496c() {
        return this.f7381f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7379d != 0 ? bon.m9829e(1, this.f7379d) + 0 : 0;
        if (this.f7380e != null) {
            iM9829e += bon.m9819c(2, this.f7380e == null ? avo.m8505c() : this.f7380e);
        }
        if (!this.f7381f.m9769b()) {
            iM9829e += bon.m9818c(3, this.f7381f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
